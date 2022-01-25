package uz.pdp.apptask6_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class USSD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String text;

    @ManyToOne
    private PhscalDefinition phscalDefinition;

    @ManyToOne
    private LegalDefinition legalDefinition;
}
