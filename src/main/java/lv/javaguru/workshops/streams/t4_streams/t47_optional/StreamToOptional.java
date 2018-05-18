package lv.javaguru.workshops.streams.t4_streams.t47_optional;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.Optional;

public class StreamToOptional {

    public static void main(String[] args) {
        User user = findFirstByNicknamePrefix("jo");
        if (user != null){
            user.setActive(false);
        } else {
            throw new IllegalArgumentException("user not found by prefix jo");
        }
    }

    static User findFirstByNicknamePrefix(String prefix){
        UserRepository userRepository = new UserRepository();
        for (User user : userRepository.getAll()) {
            if (user.getNickname().startsWith(prefix)){
                return user;
            }
        }
        return null;
    }

}
