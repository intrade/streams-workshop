package lv.javaguru.workshops.streams.t1_codeduplicates;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class C0_UserService {

    static UserRepository userRepository = new UserRepository();

    //todo : Create interface Matcher with method "boolean matches(User)"
    //todo : replace code duplicates with anonymous classes of interface Matcher
    //todo : then replace anonymous classes with lambda expression

    public static void main(String[] args) {
        System.out.println("----- users by prefix jo ");
        List<User> byPrefix = findByNicknamePrefix("jo");
        System.out.println(byPrefix);

        System.out.println("----- users by suffix n ");
        List<User> bySuffix = findByNicknameSufix("n"); 
        System.out.println(bySuffix);

        System.out.println("----- users created during last month");
        List<User> createdDuringLastMonth = findByCreatedAtAfter(LocalDateTime.now().minusMonths(1));
        System.out.println(createdDuringLastMonth);
    }

    static List<User> findByNicknamePrefix(String prefix){
        List<User> users = new ArrayList<>();
        for (User user : userRepository.getAll()) {
            if (user.getNickname().startsWith(prefix)) {
                users.add(user);
            }
        }
        return users;
    }

    static List<User> findByNicknameSufix(String suffix){
        List<User> users = new ArrayList<>();
        for (User user : userRepository.getAll()) {
            if (user.getNickname().endsWith(suffix)) {
                users.add(user);
            }
        }
        return users;
    }

    static List<User> findByCreatedAtAfter(LocalDateTime after){
        List<User> users = new ArrayList<>();
        for (User user : userRepository.getAll()) {
            if (user.getCreatedAt().isAfter(after)) {
                users.add(user);
            }
        }
        return users;
    }

}
