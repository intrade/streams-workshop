package lv.javaguru.workshops.streams.t4_streams.t42_peek;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {

    // use peek for debugging only!
    public static void main(String[] args) {


    }

    //todo : rewrite method with stream
    static List<String> getAllNicknames(){
        List<User> users = new UserRepository().getAll();
        List<String> nicknames = new ArrayList<>();
        for (User user : users) {
            System.out.println("convert user : " + user);
            String nickname = user.getNickname();
            System.out.println("nickname : " + nickname);
            nicknames.add(nickname);
        }
        return nicknames;
    }

}
