package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User u : users) {
            if (u.getUsername().equals(login)) {
                System.out.println("User found");
                rsl = u;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException(
                        "User not found."
                );
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() > 2 && user.isValid()) {
            System.out.println("User is valid");
        } else {
            throw new UserInvalidException(
                    "User is invalid"
            );
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Evgenyi Ponasenkov", false),
                new User("H", true)
        };
        try {
            User user = findUser(users, "H");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
