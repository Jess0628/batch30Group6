package week7_JavaCodingTasks.danil;

import java.util.Arrays;

public class FindMinimum {
    public static int min(int[] arr){
        int min = arr[0];
        for (int e : arr) {
            if(e<min) min=e;
        }
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int e : arr) {
            if(e>max) max = e;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(min(new int[]{553,12345,-123461,-123512351, 14261234, 0}));
        System.out.println(max(new int[]{553,12345,-123461,-123512351, 14261234, 0}));
    }
}
