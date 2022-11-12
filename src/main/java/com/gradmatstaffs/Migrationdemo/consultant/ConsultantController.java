package com.gradmatstaffs.Migrationdemo.consultant;

import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/consultant")
public class ConsultantController {

    private final ConsultantService consultantService;

    public ConsultantController(ConsultantService consultantService)
    {
        this.consultantService = consultantService;
    }

    @GetMapping
    public String index()
    {
        return "Welcome to the Consultant API";
    }

    @GetMapping(path="{id}/patients")
    public List<PatientDTO> getAllPatientsForConsultant(@PathVariable("id") int consultantId)
    {
        return consultantService.getAllPatientsForConsultant(consultantId);
    }

}
