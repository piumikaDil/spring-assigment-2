package lk.ijse.assigment.dto;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLeadDTO implements Serializable,SuperDTO{
    private String id;
    private String name;
    private String email;
    private String address;

}
