package week10_JavaCodingTasks.danil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMabByValue {
    public static void main(String[] args) {
        Map<String, String> words = new LinkedHashMap<>(Map.of(
                "one","ABC",
                "two", "AABBCC",
                "three", "AAABBBCCC",
                "four", "zxy",
                "five", "xyz"
        ));
        System.out.println("words = " + words);
        System.out.println("sortMapByValue(words) = " + sortMapByValue(words));
    }
    public static Map<String, String> sortMapByValue(Map<String, String> map){
        List<String> list = map.values().stream().collect(Collectors.toList());
        ArrayListAscendingOrder.sortAscending((ArrayList<String>)list);
        int i = 0;
        for(Map.Entry e : map.entrySet()){
            e.setValue(list.get(i++));
        }
        return map;
    }
}
