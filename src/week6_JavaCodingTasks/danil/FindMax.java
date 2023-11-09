package week6_JavaCodingTasks.danil;

public class FindMax {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1,4,5,6,7, -1776636563, 1231237418}));
    }
    private static int findMax(int[] input){
        int result = input[0];
        for(int e : input){
            if(e>result) result = e;
        }
        return result;
    }
}
