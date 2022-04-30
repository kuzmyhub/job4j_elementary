package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String conferencesAttended;

    public Surgeon(String name, String surname,
                   String education, String birthday,
                   String degree, String conferencesAttended) {
        super(name, surname, education, birthday, degree);
        this.conferencesAttended = conferencesAttended;
    }

    public String getConferencesAttended() {
        return conferencesAttended;
    }
}
