package lv.javaguru.workshops.streams.code;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * UserRepository class stores all users
 * and provides methods to search them
 */
public class UserRepository {

    private final Set<User> users;

    public UserRepository() {
        Set<User> users = new HashSet<>();
        users.add(new User("john89", LocalDateTime.now().minusDays(1), true));
        users.add(new User("jose", LocalDateTime.now().minusDays(4), true, "jose-facebook", null));
        users.add(new User("toe", LocalDateTime.now().minusDays(4), true, null, "toe-twitter"));
        users.add(new User("digger", LocalDateTime.now().minusDays(10), true));
        users.add(new User("nessie", LocalDateTime.now().minusDays(2), true, "nessie-facebook", "nessie-twitter"));
        users.add(new User("freak", LocalDateTime.now().minusDays(3), false));
        users.add(new User("odmen", LocalDateTime.now().minusDays(3), true));
        this.users = users;
    }

    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    /*
     * TODO : home task
     * move common logic into private method "User findBy(Predicate<User> predicate)"
     * use created method in public methods findBy** with lambda expression
     * */

    public User findByNickname(String nickname) {
        Asserts.notEmpty(nickname);
        for (User user : users) {
            if (nickname.equals(user.getNickname())) {
                return user;
            }
        }
        return null;
    }

    public User findByFacebookId(String facebookId) {
        Asserts.notEmpty(facebookId);
        for (User user : users) {
            if (facebookId.equals(user.getFacebookId())) {
                return user;
            }
        }
        return null;
    }

    public User findByTwitterId(String twitterId) {
        Asserts.notEmpty(twitterId);
        for (User user : users) {
            if (twitterId.equals(user.getTwitterId())) {
                return user;
            }
        }
        return null;
    }

    public void save(User user) {
        users.add(user);
    }
}
