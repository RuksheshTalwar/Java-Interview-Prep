package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.liskovsubstitution.BadCode;

// Violation of LSP is happening because here parent support Read + Write operations on a File
// but child class only supports Read operation
// Every operation that is there with Parent class, Child class should also be able to support -
// Liskov substitution Principle
public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); //works fine
        file.write();//throwing an exception, violation of LSP

    }
}
