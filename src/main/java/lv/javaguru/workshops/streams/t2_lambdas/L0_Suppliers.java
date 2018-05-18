package lv.javaguru.workshops.streams.t2_lambdas;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class L0_Suppliers {

    public static void main(String[] args) {
        //todo : replace generateNumber with lambda
        //todo : replace usersCount with lambda
        //todo : replace getAllUsersNicknames
    }

    private int generateNumber() {
        return new Random().nextInt();
    }

    private static int usersCount(){
        UserRepository repository = new UserRepository();
        List<User> users = repository.getAll();
        return users.size();
    }

    private static List<String> getAllUsersNicknames(){
        UserRepository repository = new UserRepository();
        List<User> users = repository.getAll();
        List<String> nicknames = new ArrayList<>();
        for (User user : users) {
            nicknames.add(user.getNickname());
        }
        return nicknames;
    }

}
