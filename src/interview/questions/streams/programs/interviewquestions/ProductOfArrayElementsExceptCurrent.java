package interview.questions.streams.programs.interviewquestions;

public class ProductOfArrayElementsExceptCurrent {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++) {
            int result = 1;
            for (int j = 0; j< arr.length;j++) {
                if(i==j) {
                } else{
                    result = result * arr[j];
                }
            }
            arr[i] = result;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
