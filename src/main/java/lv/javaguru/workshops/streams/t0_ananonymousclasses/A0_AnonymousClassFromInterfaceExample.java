package lv.javaguru.workshops.streams.t0_ananonymousclasses;

import java.awt.*;
import java.io.File;
import java.util.function.Consumer;
import java.util.function.Function;

public class A0_AnonymousClassFromInterfaceExample {

    /**
     * TODO :
     * create object of anonymous class which extends Printer
     * print something to console
     */
    public static void main(String[] args) {
        Printer printer = null;
        printer.print("text");
    }

    public interface Printer {
        void print(String message);
    }
}
