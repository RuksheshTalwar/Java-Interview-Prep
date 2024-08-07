package interview.questions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedvsUncheckedException {
    public static void main(String[] args) {
        readFile("myFile.txt");
    }

    /**
     * Checked Exception can be handled in 2 ways ->
     * 1. Surround the code block throwing Checked Exception with try/catch block
     * 2. Using throws keyword with the method signature
     * BONUS -> throws keyword need to be appended to method signature wherever that method is being called
     * @param fileName
     */
    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch(FileNotFoundException fnfe) {
            System.out.println("Hey that file doesn't exist");
        }
    }
}
