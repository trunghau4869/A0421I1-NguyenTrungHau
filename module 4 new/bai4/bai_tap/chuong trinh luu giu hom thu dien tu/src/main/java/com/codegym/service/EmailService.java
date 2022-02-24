package com.codegym.service;

import com.codegym.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailService implements IEmailService {
    private static List<Email> emailList;

    static {
        emailList = new ArrayList<>();
        emailList.add(new Email(1,"English", 20, true, "John"));
        emailList.add(new Email(2,"Vietnamese", 15, false, "Mike"));
        emailList.add(new Email(3,"Japanese", 25, true, "Alex"));
        emailList.add(new Email(4,"Chinese", 10, false, "Son"));
    }

    @Override
    public List<Email> getEmailList() {
        return emailList;
    }

    @Override
    public void saveEmail(Email email) {
        emailList.add(email);
    }

    @Override
    public void updateEmail(Email email) {

    }

    @Override
    public void editEmail(Email email) {

    }

    @Override
    public Email finEmail(int id) {
        return emailList.get(id);
    }


}
