package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error def = new Error();
        Error first = new Error(true, 201, "Created");
        Error second = new Error(true, 401, "Unauthorized");
        Error third = new Error(true, 507, "Insufficient Storage");

        def.printInfo();
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
