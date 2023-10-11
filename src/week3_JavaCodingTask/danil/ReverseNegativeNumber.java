package week3_JavaCodingTask.danil;

import java.util.Random;

public class ReverseNegativeNumber {

    public static String reverseNegative(String input){
        String[] nums = input.split(" ");
        String res = "";
        for (int i = 0; i<nums.length; i++) {
            if(nums[i].contains("-")) nums[i] = "-"+new StringBuilder(nums[i].replace("-","")).reverse();
        }
        for (String num : nums) {
            res+=num+" ";
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Random r = new Random();
        String one = "";
        String two = "-";
        String three = "";

        for (int i = 0; i<8; i++){
            one+=r.nextInt(9);
            two+=r.nextInt(9);
            three+=r.nextInt(9);
        }

        String nums = ""+one+" "+two+" "+three;
        System.out.println(nums);
        reverseNegative(nums);

    }
}
