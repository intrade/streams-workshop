package lv.javaguru.workshops.streams.t2_lambdas;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class L2_Consumers {

    public static void main(String[] args) {
        //todo : replace printDate with lambda
        //todo : replace createUser with lambda
    }

    private static void printDate(LocalDate date) {
        System.out.println(DateTimeFormatter.ISO_DATE.format(date));
    }

    private static void createUser(String nickname) {
        UserRepository repository = new UserRepository();
        User existing = repository.findByNickname(nickname);
        if (existing != null) {
            throw new IllegalArgumentException("nickname must be unique");
        }
        User newUser = new User(nickname, LocalDateTime.now(), true);
        repository.save(newUser);
    }

}
