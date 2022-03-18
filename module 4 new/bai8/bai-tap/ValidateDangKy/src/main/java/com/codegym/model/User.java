package com.codegym.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.ConstraintViolation;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Set;

@Entity
@Component
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "First Name is mandatory")
    @Size(min = 5, max = 45)
    private String firstName;
    @NotEmpty(message = "Last Name is mandatory")
    @Size(min = 5, max = 45)
    private String lastName;

    private String PhoneNumber;
    @Min(18)
    private String age;
    @Email
    private String Email;

    public User() {
    }

    public User(int id, String firstName, String lastName, String phoneNumber, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        PhoneNumber = phoneNumber;
        this.age = age;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        if (phoneNumber.length() > 11 || phoneNumber.length() < 10) {
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
    }
}
