package main.java.string_coding_questions;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        //Unicode characters are allowed
        String var1 = "Rukshesh \u00f1";
//        String var1 = "10";
//        String var1 = "Study";
//        String var2 = "Easy";
        String var2 = "100";
        int var3 = 10;
        // + is an overloaded operator -> helps to concatenate String variables and adds numbers
        //Here int var3 will be implicitly type casted, so it will be concatenated with 2 String variables
//        System.out.println(var1 + var2 + var3);
        //Convert String to Integer using Integer.parseInt() function
//        System.out.println(Integer.parseInt(var2));
        /**
         * In case of String variables holding decimal integers in string format,
         * variables will be concatenated together and not added together
         */
//        System.out.println(var1+var2);
        System.out.println(var1);
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        Set<Integer> s =new HashSet<>();
    }
}
