package lv.javaguru.workshops.streams.t1_codeduplicates;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class C1_SortingExample {

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
