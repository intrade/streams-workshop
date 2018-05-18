package lv.javaguru.workshops.streams.t4_streams.t41_mapping;

import java.util.ArrayList;
import java.util.List;

public class Mapping {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("ab");
        strings.add("abc");
        strings.add("abcde");
        List<Integer> converted = convertToLength(strings);
        System.out.println(converted);
    }

    static List<Integer> convertToLength(List<String> strings){
        List<Integer> result = new ArrayList<>();
        for (String string : strings) {
            result.add(string.length());
        }
        return result;
    }



}
