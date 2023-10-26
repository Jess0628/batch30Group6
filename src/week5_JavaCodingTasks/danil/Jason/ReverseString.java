package week5_JavaCodingTasks.danil.Jason;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str = "qwerty";
        char[] arr = str.toCharArray();
        int a = 0;
        int b = arr.length-1;
        while (a<b){
            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
