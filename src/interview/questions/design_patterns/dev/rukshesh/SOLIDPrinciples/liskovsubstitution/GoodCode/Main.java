package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.liskovsubstitution.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile readableFile) {
        readableFile.readFile();
    }

    public static void main(String[] args) {
        //ReadableFile class only supports read operation on a File
        ReadableFile readableFile = new ReadableFile();
        readableFile.readFile();
        //WritableFile class supports read and write operations on a File
        WritableFile writableFile = new WritableFile();
        writableFile.writeFile();
        writableFile.readFile();

        /**
         * Since ReadableFile is the correct parent class because WritableFile
         * can also be read
         * Both ReadableFile and WritableFile can be substituted here, therefore our
         * Liskov Substitution principle is adhered to in this code sample
         */

        readAnyFile(writableFile);
        readAnyFile(readableFile);

    }
}
