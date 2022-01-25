package uz.pdp.apptask6_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apptask6_1.entity.Branches;
import uz.pdp.apptask6_1.entity.Customers;

@Projection(types = Customers.class)
public interface CustomCustomers {
}
