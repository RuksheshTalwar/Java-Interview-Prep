package interview.questions.generics;

public class OurGenericList<T>{
    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }
}
