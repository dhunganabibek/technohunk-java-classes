package string;

import java.lang.String;

public class Main {
    public static void main(String[] args) {

        //Create string data in intern pool or String pool (located in method area).
        String s1 = "Bibek";

        //create the string in heap area.
        String s2 = new String("Dhungana");

    }
}
