package Jason;

import java.util.ArrayList;

public class FirstDuplicatedElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 3};
        System.out.println(firstDupli(arr));
    }


    public static int firstDupli(int[] arr){
        ArrayList<Integer> newint = new ArrayList<>();
        for (int j : arr) {
            if (newint.contains(j)) {
                return j;
            }
            newint.add(j);
        }
        return 0;
    }
}
