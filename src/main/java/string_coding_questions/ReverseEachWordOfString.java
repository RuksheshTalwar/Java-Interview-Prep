package main.java.string_coding_questions;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Welcome To Java !";
        StringBuilder sb = new StringBuilder();
        String arr[] = str.split(" ");
        for (int i = 0; i< arr.length; i++) {
            sb.append(new StringBuilder(arr[i]).reverse() + " ");
        }
        System.out.println(sb);
    }
}
