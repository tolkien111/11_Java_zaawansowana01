package com.sda.klasyiinterfasy.zadania.zadanie4;

public class UserApp {
    public static void main(String[] args) {


        User user = new User();

        user.setName("Robert", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });


        user.setSurname("Lewandowski", input -> !input.isEmpty() && Character.isUpperCase(input.charAt(0)));


        user.setAge(33, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });


        user.setLogin("RL9BayernM", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });

        user.setPassword("Zlotapilka!", input -> input.contains("!"));

        System.out.println(user);
    }
}
