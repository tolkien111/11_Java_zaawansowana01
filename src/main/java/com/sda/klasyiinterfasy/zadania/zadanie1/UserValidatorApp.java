package com.sda.klasyiinterfasy.zadania.zadanie1;

public class UserValidatorApp {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();

        String [] emails = userValidator.validateEmails("kamil.baronowski@wp.pl", "gmail.com");
        System.out.println(emails[0]);
        System.out.println(emails[1]);
    }
}
