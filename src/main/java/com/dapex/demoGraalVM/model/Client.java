package com.dapex.demoGraalVM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "client")
public class Client {
    @Id
    private int id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;

    public String getName() {
        return name;
    }
}
