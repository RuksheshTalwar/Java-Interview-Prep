package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.liskovsubstitution.GoodCode;

public class ReadableFile implements ReadableInterface {

    @Override
    public void readFile() {
        System.out.println("Reading file...");
    }
}
