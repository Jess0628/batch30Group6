package week8_JavaCodingTasks.danil;

import java.util.Arrays;
import java.util.Random;

public class SumUpToZero {
    /*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */

    public static int[] sumUpToZero(int n) {
        int[] result = new int[n];
        Random random = new Random();

        for (int i = 0; i < n - 1; i++) {
            int num = random.nextInt(100);

            while (containsElement(num, result)) {
                num = random.nextInt(100);
            }

            if (sumOfArrayElements(result) > 70){
                num *= -1;
            }

            result[i] = num;
        }
        int lastOne = sumOfArrayElements(result) * -1;

        while (containsElement(lastOne,result)){
            int num2 = result[result.length-2]+random.nextInt(10);
            while (containsElement(num2, result)){
                num2 = result[result.length-2]+random.nextInt(10);
            }
            lastOne = sumOfArrayElements(result) * -1;
        }
        result[result.length - 1] = lastOne;
        return result;
    }

    public static int sumOfArrayElements(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    public static boolean containsElement(int element, int[] arr) {
        for (int e : arr) {
            if (e == element) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = sumUpToZero(6);
        System.out.println(Arrays.toString(a));
        System.out.println(sumOfArrayElements(a));
    }
}
