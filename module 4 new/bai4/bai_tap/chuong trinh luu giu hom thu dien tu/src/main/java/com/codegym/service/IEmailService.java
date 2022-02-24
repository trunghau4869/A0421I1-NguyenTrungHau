package com.codegym.service;

import com.codegym.model.Email;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmailService {
    List <Email> getEmailList();
    void saveEmail(Email email);
    void updateEmail(Email email);
    void editEmail(Email email);
    Email finEmail(int id);

}
