package uz.pdp.apptask6_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apptask6_1.entity.Director;
import uz.pdp.apptask6_1.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    boolean existsByFullName(String fullName);


}
