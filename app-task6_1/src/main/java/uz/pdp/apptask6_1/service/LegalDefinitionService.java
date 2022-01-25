package uz.pdp.apptask6_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import uz.pdp.apptask6_1.entity.LegalDefinition;
import uz.pdp.apptask6_1.repository.LegalDefinitionRepository;

import java.util.List;

@Service
public class LegalDefinitionService {
    @Autowired
    LegalDefinitionRepository legalDefinitionRepository;

    public List<LegalDefinition> get() {

        List<LegalDefinition> definitionRepositoryAll = legalDefinitionRepository.findAll();
        return definitionRepositoryAll;

    }
}