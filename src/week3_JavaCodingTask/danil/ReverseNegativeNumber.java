package week3_JavaCodingTask.danil;

import java.util.Random;

public class ReverseNegativeNumber {

    public static String reverseNegative(String input){
        String[] nums = input.split(" ");
        String res = "";
        for (int i = 0; i<nums.length; i++) {
            if(nums[i].contains("-")) nums[i] = "-"+new StringBuilder(nums[i].replace("-","")).reverse();
            res+=nums[i]+" ";
        }

        System.out.println(res);
        return res;
    }

    public static int reverseNum(int num){
        //12341%10 = 1 last digit
        //12341/10 = 1234 removed the last digit
        //result = result*10+last digit
        int result = 0;
        while(num!=0){
            int lastDigit = num%10;
            num/=10;
            result = result*10+lastDigit;
        }
        return result;
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

        System.out.println("reverseNum(12565) = " + reverseNum(12565));

    }
}
