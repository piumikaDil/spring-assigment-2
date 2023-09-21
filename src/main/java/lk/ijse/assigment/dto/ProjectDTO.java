package lk.ijse.assigment.dto;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lk.ijse.assigment.entity.TechLead;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO implements Serializable,SuperDTO {
    private String id;
    private String name;
    private String description;
    private int projectNumber;
    private TechLead techLead;
}
