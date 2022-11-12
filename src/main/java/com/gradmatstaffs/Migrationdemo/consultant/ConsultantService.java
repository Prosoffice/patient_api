package com.gradmatstaffs.Migrationdemo.consultant;

import com.gradmatstaffs.Migrationdemo.dto.PatientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {

    private final ConsultantRepository consultantRepository;

    public ConsultantService(ConsultantRepository consultantRepository)
    {
        this.consultantRepository = consultantRepository;
    }

    public List<PatientDTO> getAllPatientsForConsultant(int consultantId)
    {
        return this.consultantRepository.findAllPatientsForConsultant(consultantId);
    }
}
