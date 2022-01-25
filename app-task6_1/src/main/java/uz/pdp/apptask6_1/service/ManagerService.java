package uz.pdp.apptask6_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.apptask6_1.entity.Manager;
import uz.pdp.apptask6_1.payload.ApiResponse;
import uz.pdp.apptask6_1.payload.SaveManagerDto;
import uz.pdp.apptask6_1.repository.ManagerRepository;
@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public ApiResponse saveManager(SaveManagerDto saveManagerDto){

        boolean fullName = managerRepository.existsByFullName(saveManagerDto.getFullName());
        if (fullName) return new ApiResponse("This is Such a manager", true);

        Manager manager=new Manager(null, saveManagerDto.getFullName());

        managerRepository.save(manager);

        return new ApiResponse("suucsess", true);

    }

}
