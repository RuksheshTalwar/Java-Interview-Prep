package interview.questions.comparator;

public class TypeErsaure1 {
    // Counts the number of occurrences of elem in anArray.
//
    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }

    public static void main(String[] args) {
        String[] arr = new String[6];
        arr[0] = "a";
        arr[1] = "a";
        arr[2] = "c";
        arr[3] = "d";
        arr[4] = "e";
        arr[5] = "f";
        System.out.println(count(arr, "a"));
    }
}
