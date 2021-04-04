package com.sda.klasyiinterfasy.zadania.zadanie1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    static final String regex = ("([a-zA-Z])[A-Za-z0-9()+_.-]+@([A-Za-z0-9]+)\\.([a-z]+)");
    static final Pattern VALIDATE_EMAIL_ADDRESS = Pattern.compile(regex);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALIDATE_EMAIL_ADDRESS.matcher(emailStr);
        return matcher.find();
    }

    public String[] validateEmails(String email, String alternativeEmail) {

        class Email {
            private final String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !validate(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        String[] emails = new String[]{email1.email, email2.email};
        return emails;
    }

}
