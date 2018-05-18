package lv.javaguru.workshops.streams.t0_ananonymousclasses;

import lv.javaguru.workshops.streams.code.User;

import java.time.LocalDateTime;

public class A1_AnonymousImmutableClassExample {

    /**
     * TODO :
     * create object of anonymous class which
     * extends class User and overrides method
     * getNickname().
     * Use nickname "john" in constructor but
     * getNickname should return value "nick"
     */
    public static void main(String[] args) {
        User user = new User("john", LocalDateTime.now(), true);
        System.out.println(user.getNickname());
    }
}