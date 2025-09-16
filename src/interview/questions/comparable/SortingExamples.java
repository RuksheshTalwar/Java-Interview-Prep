package interview.questions.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingExamples {
    public static void main(String[] args) {
        Integer[] arr = {17, 18, 23, 28, 4, 6, 9};
        Arrays.sort(arr, (val1, val2) -> val1 - val2);
        Arrays.sort(arr);
    }

}
