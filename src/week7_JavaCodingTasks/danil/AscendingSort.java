package week7_JavaCodingTasks.danil;

import java.util.Arrays;

public class AscendingSort {
 /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
  */

    public static int[] ascSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }
        return arr;
    }

    public static int[] descSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                if(i>0){
                    if(arr[i]<arr[i-1]){
                        i=-1;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] descSort2(int[]arr){
        for(int i = 0; i<arr.length-1; i++){ // compare 2 neigbor numbers in array starting from 0
            if(arr[i]<arr[i+1]){ // if current is larger than following
                int temp = arr[i]; // save current
                arr[i] = arr[i+1]; // move following to the left
                arr[i+1] = temp; // move current to the right

                if(i>0){
                    if(arr[i]>arr[i-1]){ // after first swap check if previous is smaller than current
                        for(int j = i; j>0; j--){ //iterate backwards from current
                            if(arr[j]>arr[j-1]){ // if previous is smaller than current
                                int temp2 = arr[j]; // perform swap
                                arr[j] = arr[j-1];
                                arr[j-1] = temp2;
                            }
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascSort(new int[]{123,44,13,5123,-2154, 5, 0, 33})));
        System.out.println(Arrays.toString(descSort(new int[]{123,44,13,5123,-2154, 5, 0, 33})));
        System.out.println(Arrays.toString(descSort2(new int[]{123,44,13,5123,-2154, 5, 0, 33})));
    }
}
