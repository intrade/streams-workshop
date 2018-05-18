package lv.javaguru.workshops.streams.t4_streams.t41_mapping;

import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class MappingTasks {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        List<User> users = userRepository.getAll();

        //todo : select all unique users creation dates
        Set<LocalDate> allCreationDates = null;

        //todo : select all users facebook ids, filter null values
        List<String> allFacebookIds = null;

    }



}
