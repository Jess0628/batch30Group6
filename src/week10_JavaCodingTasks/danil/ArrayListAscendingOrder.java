package week10_JavaCodingTasks.danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAscendingOrder {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ABC", "AABBCC","xyz","zxy", "AAABBBCCC", "one", "two", "tree", "four","five"));
        ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(1234.00,51.32415,51.1, 51.2,1235.00,12.00, 1235.123));
        System.out.println(sortAscending(words));
        System.out.println(sortAscending(numbers));
    }
    public static <T> ArrayList<T> sortAscending(ArrayList<T> arr){
        if(arr.get(0) instanceof String){
            for(int i = 0; i<arr.size()-1; i++){
                if(sortString((String)arr.get(i), (String)arr.get(i+1))){
                    T temp = arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,temp);
                    i = -1;
                }
            }
        }
        if(arr.get(0) instanceof Integer || arr.get(0) instanceof Double){
            for(int i = 0; i<arr.size()-1; i++){
                if((Double)arr.get(i)>(Double)arr.get(i+1)){
                    T temp = arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,temp);
                    i = -1;
                }
            }
        }

        return arr;
    }

    public static boolean sortString(String one, String two){
        for(int i = 0; i<Math.min(one.length(), two.length()); i++){
            if(one.charAt(i)<two.charAt(i)) return false;
            if(one.charAt(i)>two.charAt(i)) return true;
        }
         //if(one.length()<two.length()) return false;
          return true;
    }


}
