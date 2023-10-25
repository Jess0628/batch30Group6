package week5_JavaCodingTasks.danil;

import java.util.Scanner;

public class FindUnique {
    public static String unique(){
        String unique = "";
        for (char e : new Scanner(System.in).nextLine().toCharArray()) {
            if(!unique.contains(""+e)){
                unique+=e;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(unique());
    }
}
