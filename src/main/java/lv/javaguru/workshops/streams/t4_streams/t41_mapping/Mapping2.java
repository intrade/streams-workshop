package lv.javaguru.workshops.streams.t4_streams.t41_mapping;

import lv.javaguru.workshops.streams.code.RegistrationApplication;
import lv.javaguru.workshops.streams.code.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mapping2 {

    public static void main(String[] args) {
        List<RegistrationApplication> registrations = new ArrayList<>();
        registrations.add(new RegistrationApplication("john", "john-facebook", "john-twitter"));
        registrations.add(new RegistrationApplication("peter", "peter-facebook", "peter-twitter"));
        List<User> users = createUsers(registrations);
        System.out.println(users);
    }

    static List<User> createUsers(List<RegistrationApplication> registrations){
        List<User> users = new ArrayList<>();
        for (RegistrationApplication registration : registrations) {
            User user = convertToUser(registration);
            users.add(user);
        }
        return users;
    }

    static User convertToUser(RegistrationApplication registration){
         return new User(
                registration.getNickname(),
                LocalDateTime.now(),
                true,
                registration.getFacebookId(),
                registration.getTwitterId()
        );
    }

}
