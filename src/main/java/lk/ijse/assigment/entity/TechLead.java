package lk.ijse.assigment.entity;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class TechLead {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;

    @OneToMany(mappedBy = "techLead" ,targetEntity = Project.class,cascade = CascadeType.ALL)
    private List<Project> projectList = new ArrayList<>();
}
