package uz.pdp.apptask6_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apptask6_1.entity.Branches;

@Projection(types = Branches.class)
public interface CustomBranches {
}
