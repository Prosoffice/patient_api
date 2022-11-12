package com.gradmatstaffs.Migrationdemo.consultant;

import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsultantRepository {
    private final JdbcTemplate jdbcTemplate;

    public ConsultantRepository(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PatientDTO> findAllPatientsForConsultant(int consultantId)
    {
        List<PatientDTO> list = new ArrayList<>();

        String queryAllPatientForConsultant =
                "SELECT patient.id, patient.Name, patient.Address, patient.DateOfBirth, medicalcondition.Name AS \"Condition\", consultant.Name AS \"Consultant\" " +
                        "FROM patient " +
                        "JOIN medicalcondition ON patient.ConditionId = medicalcondition.id " +
                        "JOIN consultant ON patient.ConsultantId = consultant.id " +
                        "WHERE consultant.id = ?";

        SqlRowSet rs = jdbcTemplate.queryForRowSet(queryAllPatientForConsultant, consultantId);

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
}
