package uz.pdp.apptask6_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.apptask6_1.entity.Employee;
import uz.pdp.apptask6_1.payload.ApiResponse;
import uz.pdp.apptask6_1.payload.EmployeeDto;
import uz.pdp.apptask6_1.service.EmployeeService;

@RestController
@RequestMapping("/api/branchdirector")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save/employee")
    public HttpEntity<?> save(@PathVariable EmployeeDto employeeDto){

        ApiResponse save = employeeService.save(employeeDto);
        return ResponseEntity.status(200).body(save);

    }

    @PutMapping("/edit/employee/{id}")
    public HttpEntity<?> edit(@PathVariable EmployeeDto employeeDto, @RequestBody Integer id){
        ApiResponse save = employeeService.save(employeeDto);
        return ResponseEntity.status(202).body(save);

    }

    @DeleteMapping("/delete/employee/{id}")

    public HttpEntity<?> delete( @RequestBody Integer id) {
        ApiResponse delete = employeeService.delete(id);
        return ResponseEntity.status(204).body(delete);
    }

    @GetMapping("/get/employee/{id}")
    public HttpEntity<?> getById( @RequestBody Integer id) {

        Employee service = employeeService.getById(id);
        return ResponseEntity.status(204).body(service);

    }


}
