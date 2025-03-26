package interview.questions.concurrency.multithreading.deadlockproblem;

public class Pen {

    /**
     * If any instance method is declared with synchronized keyword, this means this method
     * will acquire the intrinsic lock of the object this method belongs to, like this method will acquire the Pen's object
     * Now this method writeWithPenAndPaper(paper) has called finishWriting() method but as this method is also synchronized, it has
     * intrinsic lock of Paper object, writeWithPenAndPaper(paper) method is trying to acquire Paper object's lock
     */
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper ");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}
