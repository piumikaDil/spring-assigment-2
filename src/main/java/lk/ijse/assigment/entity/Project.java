package lk.ijse.assigment.entity;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Project {
    @Id
    private String id;
    private String name;
    private String description;
    private int projectNumber;

    @ManyToOne
    private TechLead techLead;
}
