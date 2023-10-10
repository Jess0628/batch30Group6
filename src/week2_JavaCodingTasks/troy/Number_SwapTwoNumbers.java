package week2_JavaCodingTasks.troy;

public class Number_SwapTwoNumbers {

    /*
    Swap two variable' values without using a third variable
     */

    //solution 1
    public static void swap1(int a, int b) { // a=5 b=8
        a = a + b; // 5 + 8 = 13
        b = a - b; // 13 - 8 = 5
        a = a - b; // 13 - 5 = 8

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }





}
