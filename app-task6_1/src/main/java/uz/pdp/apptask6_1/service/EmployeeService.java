package uz.pdp.apptask6_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import uz.pdp.apptask6_1.entity.Branches;
import uz.pdp.apptask6_1.entity.Employee;
import uz.pdp.apptask6_1.payload.ApiResponse;
import uz.pdp.apptask6_1.payload.EmployeeDto;
import uz.pdp.apptask6_1.repository.BranchesRepository;
import uz.pdp.apptask6_1.repository.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    BranchesRepository branchesRepository;

    public ApiResponse save(EmployeeDto employeeDto) {
        boolean fullName = employeeRepository.
                existsByFullName(employeeDto.getFullName());
        if (fullName) return new ApiResponse("alresdy exist", false);


        Optional<Branches> optionalBranches = branchesRepository.findById(employeeDto.getBranchesId());
        Branches branches = optionalBranches.get();


        Employee employee = new Employee(null, employeeDto.getFullName(), branches);
        employeeRepository.save(employee);
        return new ApiResponse("Succses", true);

    }


    public ApiResponse edit(EmployeeDto employeeDto, Integer id) {

        if (!branchesRepository.existsById(id)) return new ApiResponse("Not found id", false);

        Optional<Branches> optionalBranches = branchesRepository.findById(employeeDto.getBranchesId());
        Branches branches = optionalBranches.get();


        Employee employee = new Employee(null, employeeDto.getFullName(), branches);
        employeeRepository.save(employee);
        return new ApiResponse("Succses edit", true);

    }

    public ApiResponse delete(Integer id) {
        if (!branchesRepository.existsById(id)) return new ApiResponse("Not found id", false);

        employeeRepository.deleteById(id);
        return new ApiResponse("Succsessful delete", true);
    }

    public Employee getById(Integer id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return optionalEmployee.orElse(null);

    }

}