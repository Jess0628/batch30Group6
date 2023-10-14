package week4_JavaCodingTasks.danil;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDup(String withDuplicates){
        return new LinkedHashSet<>(Arrays.asList(withDuplicates.split("")))
                .toString()
                .replace("[","")
                .replace("]","")
                .replace(",","");

    }

    public static void main(String[] args) {
        System.out.println(removeDup("HHHHHHeeellooooo"));
    }
}
