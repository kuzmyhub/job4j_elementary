package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Novel", 100);
        Book detective = new Book("Detective", 200);
        Book fiction = new Book("Fiction", 150);
        Book clean = new Book("Clean code", 5);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = detective;
        books[2] = fiction;
        books[3] = clean;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - "
                    + books[i].getPages());
        }
        System.out.println();

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - "
                    + books[i].getPages());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - "
                        + books[i].getPages());
            }
        }
    }
}
