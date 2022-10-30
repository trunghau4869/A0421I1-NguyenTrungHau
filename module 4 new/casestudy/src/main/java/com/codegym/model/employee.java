package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
public class employee implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;

    @Size(min = 3, max = 45)
    @NotEmpty
    private String employee_name;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date employee_birthday;

    @Min(value = 9)
    private int employee_id_card;

    @Min(value = 1000000, message = "luong it vay ai ma lam")
    private double employee_salary;

    @Min(value = 9)
    private int employee_phone;

    @NotEmpty
    @Size(min = 9, max = 45)
    private String employee_email;

    @NotEmpty
    @Size(min = 9, max = 45)
    private String employee_address;


//    @Size(max = 255)
//    private String username;

    @ManyToOne(targetEntity = Position.class)
    private Position position;

    @ManyToOne(targetEntity = Division.class)
    private Division division;

    @ManyToOne(targetEntity = com.codegym.model.education_degree.class)
    private com.codegym.model.education_degree education_degree;

    //    @ManyToOne(targetEntity = user.class)
//    private user user;
//
    public employee() {
    }


    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Date getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(Date employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public int getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(int employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(int employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }


    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public com.codegym.model.education_degree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(com.codegym.model.education_degree education_degree) {
        this.education_degree = education_degree;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
