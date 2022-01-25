package uz.pdp.apptask6_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.apptask6_1.entity.LegalDefinition;
import uz.pdp.apptask6_1.entity.PhscalDefinition;
import uz.pdp.apptask6_1.repository.PhscalDefinitionRepository;

import java.util.List;

@Service
public class PhscalDefinitionService {

    @Autowired
    PhscalDefinitionRepository phscalDefinitionRepository;

    public List<PhscalDefinition> get() {
        List<PhscalDefinition> definitionRepositoryAll = phscalDefinitionRepository.findAll();
        return definitionRepositoryAll;

    }
}
