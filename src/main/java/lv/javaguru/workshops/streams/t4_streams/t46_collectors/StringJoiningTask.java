package lv.javaguru.workshops.streams.t4_streams.t46_collectors;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.List;

public class StringJoiningTask {

    public static void main(String[] args) {
        List<User> users = new UserRepository().getAll();

        //todo: join all nicknames separated by ", " (john, peter, jose ...)
        String nicknames = null;
        System.out.println(nicknames);
    }

}
