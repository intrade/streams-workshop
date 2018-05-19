package lv.javaguru.workshops.streams.t2_lambdas;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.List;

public class L1_Comparators {

    public static void main(String[] args) {
        List<User> users = new UserRepository().getAll();

        //todo : sort by nickname and print with lambda
        System.out.println("---- sorted by nickname ---");
        // sort here
        System.out.println(users);

        //todo : sort by createdAt and print
        System.out.println("---- sorted by creation date ---");
        // sort here
        System.out.println(users);
    }

}
