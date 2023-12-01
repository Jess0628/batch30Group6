package week9_JavaCodingTasks.danil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveName {
    public static String[] removeString(String name, String[] arr){
        String [] result = new String[arr.length];
        int i = 0;
        int count = 0;
        for(String e : arr){
            if(e.contains(name)){
                count++;
                continue;
            }else{
                result[i++] = e;
            }
        }
        String [] res = new String[result.length-count];
        int j = 0;
        for (String s : result) {
            if(s!=null) res[j++] = s;
        }
        return res;
    }

    public static ArrayList<String> removeWord(String word, ArrayList<String>words){
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            if(it.next().contains(word)){
                it.remove();
            }
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeString("Danil", new String[]{"Tamara", "Danil", "Traisy", "Danil"})));
        System.out.println(removeWord("Danil", new ArrayList<>(Arrays.asList("Tamara", "Danil", "Traisy", "Danil"))));
    }
}
