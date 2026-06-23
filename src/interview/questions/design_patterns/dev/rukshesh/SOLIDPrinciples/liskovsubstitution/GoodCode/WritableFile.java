package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.liskovsubstitution.GoodCode;

public class WritableFile extends ReadableFile implements WritableInterface {

    @Override
    public void writeFile() {
        System.out.println("Writing file...");
    }
}
