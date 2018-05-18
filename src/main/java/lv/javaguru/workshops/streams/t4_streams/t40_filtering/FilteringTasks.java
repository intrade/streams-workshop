package lv.javaguru.workshops.streams.t4_streams.t40_filtering;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.List;

public class FilteringTasks {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        List<User> users = userRepository.getAll();

        //todo : filter users to get all users without facebook id
        List<User> withoutFacebookId = null;

        //todo : filter users to get all inactive users
        List<User> notActiveUsers = null;

        //todo : filter users to get all users which have facebook and twitter id
        List<User> haveFacebookAndTwitterId = null;
    }

}
