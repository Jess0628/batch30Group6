package week9_JavaCodingTasks.Jason;

import java.util.ArrayList;
import java.util.Arrays;

public class RemmveAhmedArrayList {



    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Jason", "Danil", "Ahmed", "Jess", "Tamara"));
        removeName("Ahmed", arr);
        System.out.println(arr);

    }
    public static void removeName(String nameToRemove, ArrayList<String> arrList){

        arrList.removeIf(p->p.equals(nameToRemove));

    }


}
