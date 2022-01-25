package uz.pdp.apptask6_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.apptask6_1.entity.LegalDefinition;
import uz.pdp.apptask6_1.entity.PhscalDefinition;
import uz.pdp.apptask6_1.service.LegalDefinitionService;
import uz.pdp.apptask6_1.service.PhscalDefinitionService;

import java.util.List;

@RestController
@RequestMapping("/api/ussd")
public class USSDController {

    @Autowired
    LegalDefinitionService legalDefinitionService;

    @Autowired
    PhscalDefinitionService phscalDefinitionService;

    @GetMapping("/legaldefinition ")
    public HttpEntity<List<LegalDefinition>> getALL(){
        List<LegalDefinition> legalDefinitions = legalDefinitionService.get();
        return (HttpEntity<List<LegalDefinition>>) legalDefinitions;
    }


    @GetMapping("/phscaldefinition")
    public HttpEntity<List<PhscalDefinition>> getAl(){
        List<PhscalDefinition> phscalDefinitions = phscalDefinitionService.get();
        return (HttpEntity<List<PhscalDefinition>>) phscalDefinitions;
    }

}
