package lv.javaguru.workshops.streams.t2_lambdas;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class L2_Functions {

    private static UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {
        //todo : replace formatDate with lambda
        //todo : replace getUsersCreatedAfter with lambda
        //todo : replace mapUsersToNicknames with lambda
    }

    private static String formatDate(LocalDate date) {
        return DateTimeFormatter.ISO_DATE.format(date);
    }

    private static List<User> getUsersCreatedAfter(LocalDateTime after) {
        List<User> allUsers = userRepository.getAll();
        List<User> found = new ArrayList<>();
        for (User user : allUsers) {
            if (user.getCreatedAt().isAfter(after)) {
                found.add(user);
            }
        }
        return found;
    }

    private static List<String> mapUsersToNicknames(Collection<User> users) {
        List<String> nicknames = new ArrayList<>();
        for (User user : users) {
            nicknames.add(user.getNickname());
        }
        return nicknames;
    }

}
