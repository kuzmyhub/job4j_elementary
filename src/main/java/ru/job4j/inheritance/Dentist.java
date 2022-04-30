package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String placesOfWork;

    public Dentist(String name, String surname,
                   String education, String birthday,
                   String degree, String placesOfWork) {
        super(name, surname, education, birthday, degree);
        this.placesOfWork = placesOfWork;
    }

    public String getPlacesOfWork() {
        return placesOfWork;
    }
}
