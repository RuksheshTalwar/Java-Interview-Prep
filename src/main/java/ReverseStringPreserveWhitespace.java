package main.java;

public class ReverseStringPreserveWhitespace {

    public static void main(String[] args) {
        String s = "Rukshesh is a smart chap";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}
