package lv.javaguru.workshops.streams.t4_streams.t43_foreach;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.List;

public class ForEachTasks {

    //todo : rewrite methods with streams
    public static void main(String[] args) {
        List<User> users = new UserRepository().getAll();
        disableUsers(users);
        printUsersNicknames(users);
    }

    static void disableUsers(List<User> users){
        for (User user : users) {
            user.setActive(false);
        }
    }

    static void printUsersNicknames(List<User> users){
        for (User user : users) {
            System.out.println(user.getNickname());
        }
    }
}
