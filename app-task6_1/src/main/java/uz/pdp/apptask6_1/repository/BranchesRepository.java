package uz.pdp.apptask6_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;
import uz.pdp.apptask6_1.Projection.CustomBranches;
import uz.pdp.apptask6_1.entity.Branches;

@RepositoryRestResource(path = "branches", excerptProjection = CustomBranches.class)
public interface BranchesRepository extends JpaRepository<Branches, Integer> {


}
