package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String projects;

    public Builder(String name, String surname,
                   String education, String birthday,
                   String workExperience, String projects) {
        super(name, surname, education, birthday, workExperience);
        this.projects = projects;
    }

    public String getProjects() {
        return projects;
    }
}
