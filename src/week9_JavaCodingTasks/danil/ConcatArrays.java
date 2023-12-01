package week9_JavaCodingTasks.danil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatArrays  {
    public static <T> T[] concatArr(T[] arr1, T[] arr2){
        T[] result = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length+arr2.length);
        int a = 0;
        for(T e : arr1){

            result[a++] = e;
        }
        for(int i = arr1.length, j = 0; i<result.length; i++, j++){
            result[i] = arr2[j];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArr(new String[]{"Hello, Goodbuy"}, new String[]{"See you soon", "Take care", "Take it easy"})));
        System.out.println(Arrays.toString(concatArr(new Integer[]{1, 2, 3, 4, 5, 6}, new Integer[]{7, 8, 9, 0, 11})));
    }
}
