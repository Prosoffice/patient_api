package com.gradmatstaffs.Migrationdemo.patient;


import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService)
    {
        this.patientService = patientService;
    }

    @GetMapping
    public String index()
    {
        return "Welcome to Patients Rest API";
    }

    @GetMapping(path="all")
    public List<PatientDTO> getAllPatients()
    {
        return patientService.getAllPatients();
    }
}
