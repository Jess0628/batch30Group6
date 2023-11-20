package week8_JavaCodingTasks.danil;

import java.util.Arrays;

public class ZeroToEnd {
    /*
    Array - Move Zeros to the End

Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZeros(int[] arr){
        int[] result = new int[arr.length];
        int beginning = 0;
        int end = arr.length-1;
        for(int e : arr){
            if(e==0){
                result[end--] = e;
            }else{
                result[beginning++] = e;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0,12,0,3,-2,0,234,0,0,33})));
    }
}
