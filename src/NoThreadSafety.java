import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NoThreadSafety {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("first");
        list.add("first");
        list.add("first");
        list.add("first");

        Runnable t1 = () -> {
            for(String str : list) {
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable t2 = () -> {
            list.add("sixth");
            list.add("seventh");
            list.add("eighth");
        };

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
