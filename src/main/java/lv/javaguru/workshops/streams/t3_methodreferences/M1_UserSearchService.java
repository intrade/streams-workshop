package lv.javaguru.workshops.streams.t3_methodreferences;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.function.Function;
import java.util.function.Supplier;

public class M1_UserSearchService {

    private static UserRepository userRepository = new UserRepository();

    //this approach is code duplicates
    //lets write with lambdas and method references

    static User findByNicknameOrThrowException(String nickname){
        User user = userRepository.findByNickname(nickname);
        if (user == null){
            throw new IllegalArgumentException("wrong nickname : " + nickname);
        }
        return user;
    }

    static User findByNicknameOrElse(String nickname, User orElse){
        User user = userRepository.findByNickname(nickname);
        if (user == null){
            return orElse;
        }
        return user;
    }

    static User findByTwitterIdOrElse(String twitterId, User orElse){
        User user = userRepository.findByTwitterId(twitterId);
        if (user == null){
            return orElse;
        }
        return user;
    }

    static User findOrElse(String property, Function<String, User> searchFunction, Supplier<User> orElse){
        User user = searchFunction.apply(property);
        if (user == null){
            return orElse.get();
        }
        return user;
    }

}
