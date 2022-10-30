package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int division_id;
    private String  division_name;

    @OneToMany(mappedBy = "employee_id")
    private Set<employee> employees;

    public Division() {
    }

    public Division(int division_id, String division_name) {
        this.division_id = division_id;
        this.division_name = division_name;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }
}
