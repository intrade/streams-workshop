package lv.javaguru.workshops.streams.code;

public class Asserts {

    public static void notEmpty(String string){
        if (string == null || string.isEmpty()){
            throw new IllegalArgumentException("argument must not be null or empty");
        }
    }

}
