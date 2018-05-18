package lv.javaguru.workshops.streams.t2_lambdas;

import java.util.function.BiFunction;

public class L3_BiFunctions {


    public static void main(String[] args) {
        //todo : replace countLetters with lambda
    }

    private static int countLetters(String string, char letter) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}
