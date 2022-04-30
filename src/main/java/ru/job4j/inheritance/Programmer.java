package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String stack;

    public Programmer(String name, String surname,
                      String education, String birthday,
                      String workExperience, String stack) {
        super(name, surname, education, birthday, workExperience);
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }
}
