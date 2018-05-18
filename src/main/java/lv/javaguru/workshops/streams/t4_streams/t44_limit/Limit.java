package lv.javaguru.workshops.streams.t4_streams.t44_limit;

import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Limit {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt());
        }
        List<Integer> positives = selectPositiveNumbers(integers, 3);
        positives.forEach(System.out::println);
    }

    //todo : rewrite method with stream
    static List<Integer> selectPositiveNumbers(List<Integer> integers, int maxCount){
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer > 0 && result.size() < maxCount){
                result.add(integer);
            }
        }
        return result;
    }

}
