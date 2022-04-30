package ru.job4j.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Philipov Andrey Vladimirivich");
        student.setGroup("EB-911");
        student.setDateOfAdmission(new Date(120, 8, 1));

        System.out.println(student.getFullName()
                + System.lineSeparator()
                + student.getGroup()
                + System.lineSeparator()
                + student.getDateOfAdmission());
    }
}
