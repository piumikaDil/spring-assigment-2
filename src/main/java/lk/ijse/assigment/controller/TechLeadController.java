package lk.ijse.assigment.controller;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lk.ijse.assigment.entity.TechLead;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/employee")
public class TechLeadController {
    @PostMapping
    public
    @GetMapping
    List<TechLead> getAllEmployees() {
        System.out.println("Ok");
        return null;
    }
}
