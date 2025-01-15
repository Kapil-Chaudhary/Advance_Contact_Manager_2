package com.scm.services;

public interface EmailService {

    // this method used in mail trap
    void sendEmail(String to, String subject, String body);

//    String sendEmail(String to, String subject, String body);


    void sendEmailWithHtml();
    void sendEmailWithAttachment();
}
