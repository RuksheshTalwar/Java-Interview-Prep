package interview.questions.concurrency.multithreading.synchronization;

class Q {
    int num;

    public void put(int num) {
        this.num = num;
    }

    public int get() {
        return num;
    }
}

class ProducerExample implements Runnable {
    Q q;

    public ProducerExample(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
//        while()
    }
}

public class InterThreadCommunication {

}
