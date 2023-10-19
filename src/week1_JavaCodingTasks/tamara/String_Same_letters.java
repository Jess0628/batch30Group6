package week1_JavaCodingTasks.tamara;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Same_letters {
    public static void main(String[] args) {
        System.out.println(same("abc","cab"));
        System.out.println(same("abc","abb"));



    }
    public static boolean same (String str1, String str2){
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        //convert both string to lowercase

        char[]arr1=str1.toCharArray();
        char[]arr2= str2.toCharArray();
        //converting the string char arrays

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //sort the character arrays

        return Arrays.equals(arr1,arr2);
    }
}
