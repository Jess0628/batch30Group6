package week3_JavaCodingTask.Jason;

public class ReverseNegativeNumber {
    public static int reverseNegative(int num){
        String current = "" + num;
        String reversed = "";
        if (num < 0) {
            for (int i = current.length() - 1; i >= 1; i--) {
                reversed += current.charAt(i);
            }
        }
        return Integer.parseInt(reversed)* -1;
    }
    public static int reverseNegative2(int num){
        int reversed = 0; // 5
        int lastDigit = 0;
        while(num < 0){
            lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        return reversed;
    }


}
