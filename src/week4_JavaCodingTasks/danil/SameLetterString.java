package week4_JavaCodingTasks.danil;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SameLetterString {
    public static boolean comparator(String one, String two){

        Set<Character> first = new TreeSet<>();
        for (int i = 0; i < one.length(); i++) {
            first.add(one.charAt(i));
        }
        Set<Character> second = new TreeSet<>();
        for (int i = 0; i < two.length(); i++) {
            second.add(two.charAt(i));
        }
        System.out.println(first);
        System.out.println(second);
        return first.equals(second);
        //return first.containsAll(second);
    }

    public static void main(String[] args) {
        System.out.println(comparator("abc","cab"));
        System.out.println(comparator("abc","abb"));
    }

}
