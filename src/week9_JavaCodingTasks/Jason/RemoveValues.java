package week9_JavaCodingTasks.Jason;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(120, 1, 2, 3, 400, 4));

        removeValues(arr);
        System.out.println(arr);

    }

    public static void removeValues(ArrayList<Integer> arr){

        arr.removeIf(p-> p > 100);

    }

}
