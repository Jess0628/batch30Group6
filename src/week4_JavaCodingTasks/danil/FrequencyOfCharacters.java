package week4_JavaCodingTasks.danil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static String counter(String input){
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(!count.containsKey(input.charAt(i))) count.put(input.charAt(i),1);
            else count.put(input.charAt(i), count.get(input.charAt(i)).intValue()+1);
        }
        String result = "";
        for(Map.Entry<Character, Integer> entry : count.entrySet()){
            Character ch = entry.getKey();
            int n = entry.getValue();
            result+=""+ch+n+" ";
            System.out.print(""+ch+n+" ");

        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        counter("Helllloooooh");
    }
}
