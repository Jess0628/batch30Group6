package week9_JavaCodingTasks.danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class RemoveValues {
    public static <T> ArrayList<T> removeValues(Predicate<T> condition, ArrayList<T> values){
        Iterator<T> it = values.iterator();
        while(it.hasNext()){
            if(condition.test(it.next()))  {
                it.remove();
            }
        }
        return values;
    }

    public static void main(String[] args) {
        System.out.println(removeValues(p -> p > 100, new ArrayList<>(Arrays.asList(1, 343, 5, 235, 5, 1325, 133, 4))));
    }
}
