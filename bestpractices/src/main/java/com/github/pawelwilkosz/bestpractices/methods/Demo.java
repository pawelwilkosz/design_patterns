package com.github.pawelwilkosz.bestpractices.methods;

public class Demo {
    public static void main(String[] argc){
        Employee e1 = new Employee.Builder()
                .withFirstName("Jan")
                .wiithSecondName("Kovalsky")
                .withAddress("Avigilon Street")
                .build();

        e1 = e1.setFirstName("John");

        System.out.println(e1.getFirstName() + " " + e1.getSecondName() + " " + e1.getAddress());
    }
}