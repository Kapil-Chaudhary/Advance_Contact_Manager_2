package com.scm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.scm.services.EmailService;

@Service
public class EmailService2 implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.properties.domain_name}")
    private String domainName;



    @Override
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        message.setFrom(domainName);
        mailSender.send(message);
    }

    @Override
    public void sendEmailWithHtml() {
        // Implement if needed
    }

    @Override
    public void sendEmailWithAttachment() {
        // Implement if needed
    }
}