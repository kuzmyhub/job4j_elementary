package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String workExperience;

    public Engineer(String name, String surname,
                    String education, String birthday,
                    String workExperience) {
        super(name, surname, education, birthday);
        this.workExperience = workExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }
}
