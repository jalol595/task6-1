package uz.pdp.apptask6_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apptask6_1.Projection.CustomBranches;
import uz.pdp.apptask6_1.Projection.CustomCustomers;
import uz.pdp.apptask6_1.entity.Branches;

@RepositoryRestResource(path = "customers", excerptProjection = CustomCustomers.class)
public interface CustomersRepository extends JpaRepository<Branches, Integer> {
}
