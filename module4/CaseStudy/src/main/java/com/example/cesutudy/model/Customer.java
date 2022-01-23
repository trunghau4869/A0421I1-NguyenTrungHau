package com.example.cesutudy.model;

import com.example.cesutudy.validation.DateOfBirth;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @Pattern(regexp = "^KH-[\\d]{4}$",message = "Must like KH-XXXX(X is number)")
    private String customerId;
    @NotBlank(message = "Name must be not empty")
    private String customerName;
//    @DateOfBirth
    private String customerBirthday;
    private String customerGender;
    @Pattern(regexp = "(\\d{9}|\\d{11}$)",message = "Id'length must be 9 or 11 number")
    private String customerIdCard;
    @Pattern(regexp = "^0(\\d{9}$)",message = "Phone's length must be 10 number and start with 0 ")
    private String customerPhone;
    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Email must be like: codegym@gmail.com")
    private String customerEmail;
    @NotBlank(message = "Address must be not empty")
    private String customerAddress;
    @ManyToOne(targetEntity = CustomerType.class)
    @JoinColumn(name = "customer_type_ID", referencedColumnName = "customeTypeId")
    private CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
}
