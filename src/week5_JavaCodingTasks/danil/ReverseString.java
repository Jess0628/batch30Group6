package week5_JavaCodingTasks.danil;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static String reverse(){
        String input = new Scanner(System.in).nextLine();
        String[] arr = input.split("");
        String start = "";
        String end = "";

        for (int i = 0; i < input.length()/2; i++) {
            String last = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = last;



        }

        return Arrays.toString(arr)
                .replace("[","")
                .replace(", ", "")
                .replace("]","");
    }

    public static void main(String[] args) {
        System.out.println(reverse());
    }
}
