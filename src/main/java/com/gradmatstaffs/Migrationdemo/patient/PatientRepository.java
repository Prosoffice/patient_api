package com.gradmatstaffs.Migrationdemo.patient;

import com.gradmatstaffs.Migrationdemo.dto.NewPatientDTO;
import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {

    private final JdbcTemplate jdbcTemplate;

    public PatientRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PatientDTO> findAllPatients()
    {
        List<PatientDTO> list = new ArrayList<>();

        String queryAllPatients =
                "SELECT patient.id, patient.Name, patient.Address, patient.DateOfBirth, medicalcondition.Name AS \"Condition\", consultant.Name AS \"Consultant\" " +
                        "FROM patient " +
                        "JOIN medicalcondition ON patient.ConditionId = medicalcondition.id " +
                        "JOIN consultant ON patient.ConsultantId = consultant.id;";

        SqlRowSet rs = jdbcTemplate.queryForRowSet(queryAllPatients);

        while (rs.next())
        {
            list.add(
                    new PatientDTO(
                            rs.getInt("id"),
                            rs.getString("Name"),
                            rs.getString("Address"),
                            rs.getDate("DateOfBirth").toLocalDate(),
                            rs.getString("Condition"),
                            rs.getString("Consultant")
                    )
            );
        }

        return list;
    }

    public void insertPatient(NewPatientDTO newPatientDTO)
    {
        String query = "INSERT INTO Patient (id, name, address, DateOfBirth, ConsultantId, ConditionId) VALUES (?,?,?,?,?,?)";

        jdbcTemplate.update(
                query,
                newPatientDTO.getId(),
                newPatientDTO.getName(),
                newPatientDTO.getAddress(),
                java.sql.Date.valueOf(newPatientDTO.getDateOfBirth()),
                newPatientDTO.getConsultantId(),
                newPatientDTO.getConsultantId()
        );
    }
}
