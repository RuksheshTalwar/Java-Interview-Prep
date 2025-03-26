package interview.questions.concurrency.multithreading.deadlockproblem;

public class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (paper) {
            pen.writeWithPenAndPaper(paper); //thread1 locks pen and tries to lock paper
        }
    }
}
