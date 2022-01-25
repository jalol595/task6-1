package uz.pdp.apptask6_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.apptask6_1.payload.ApiResponse;
import uz.pdp.apptask6_1.payload.SaveManagerDto;
import uz.pdp.apptask6_1.service.ManagerService;

@RestController
@RequestMapping("/api/director")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @PostMapping("/save")
    public HttpEntity<?> saveManager(@PathVariable SaveManagerDto saveManagerDto) {

        ApiResponse apiResponse = managerService.saveManager(saveManagerDto);
        return ResponseEntity.status(200).body(apiResponse);
    }


}
