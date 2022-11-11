package com.gradmatstaffs.Migrationdemo.patient;

import com.gradmatstaffs.Migrationdemo.dto.NewPatientDTO;
import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository)
    {
        this.patientRepository = patientRepository;
    }

    public void createPatient(NewPatientDTO newPatientDTO)
    {
        patientRepository.insertPatient(newPatientDTO);
    }

    public List<PatientDTO> getAllPatients()
    {
        return patientRepository.findAllPatients();
    }
}
