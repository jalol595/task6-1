package uz.pdp.apptask6_1.entity;

import com.sun.istack.Interned;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String fullName;

    @ManyToOne
    private Branches branches;

    public Employee(Integer id, String fullName, Branches branches) {
        this.id = id;
        this.fullName = fullName;
        this.branches = branches;
    }


    private String userName;

}
