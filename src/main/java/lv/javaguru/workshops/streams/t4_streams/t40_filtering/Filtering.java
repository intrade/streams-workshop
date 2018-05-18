package lv.javaguru.workshops.streams.t4_streams.t40_filtering;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Filtering {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("ab");
        strings.add("abc");
        strings.add("abcde");
        List<String> filtered = filterByLength(strings, 3);
        System.out.println(filtered);
    }

    static List<String> filterByLength(List<String> strings, int length){
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.length() >= length){
                result.add(string);
            }
        }
        return result;
    }

}
