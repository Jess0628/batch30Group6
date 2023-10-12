package week2_JavaCodingTasks.danil;

public class SwapTwoVariables {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";

        one=one+two;
        two = one.replace(two,"");
        one = one.replace(two, "");

        System.out.println(one+two);

        int a = 5;
        int b = 10;

        a^=b;
        b^=a;
        a^=b;

        System.out.println(a+" "+b);

    }





}
