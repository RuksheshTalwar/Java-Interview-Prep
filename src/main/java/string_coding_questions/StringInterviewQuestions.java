package main.java.string_coding_questions;

/**
 * Difference between below creation of String objects is that
 * 1) No 2 string objects can have the same value in a string constant pool.
 * 2) Each and every object in the string constant pool is unique
 * In String constant pool, we reutilize the memory space
 *
 */
public class StringInterviewQuestions {
    public static void main(String[] args) {
        /**
         * String class by default doesn't work with (-) subtraction operator,(/) division operator etc
         * but it works with (+) operator
         */
        String str1 = "Rukshesh"; //This is a literal assignment -> str object is created in String constant pool
        String str3 = "Rukshesh";
        System.out.println(str1 == str3); //true
        String str2 = new String("Rukshesh"); //str2 object is created in Heap memory
        String str4 = new String("Rukshesh"); //new keyword always creates a new object in the Heap memory
        System.out.println("str2.hashCode() -> " + str2.hashCode());
        /**
         * false -> since == will do comparison between memory addresses and since str2 and str4 are present in different memory address, its false
         */
        System.out.println(str2 == str4);
    }
}
