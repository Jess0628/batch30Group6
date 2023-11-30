package week9_JavaCodingTasks.Jason;

import java.util.Arrays;

public class Concat2Arrays {


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2){
        int arraySize = arr1.length + arr2.length;
        int [] concated = new int[arraySize];

        for (int i = 0, j=0; i < arr1.length; i++, j++) {
            concated[i] = arr1[j];
        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            concated[j] = arr2[i];
        }

        return concated;

    }

}
