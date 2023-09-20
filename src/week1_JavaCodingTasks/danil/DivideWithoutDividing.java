package week1_JavaCodingTasks.danil;

import java.text.DecimalFormat;

public class DivideWithoutDividing {
    public static void divide(int number, int divider){
        int result;
        int div;
        double n = 0; // this stores the whole number
        double n2 = 0; // this stores decimal points
        DecimalFormat df = new DecimalFormat("0.00");

        if (number > 0 && divider > 0){
            result = number;
            div = divider;
        } else if (number < 0 && divider < 0){
            result = number*-1;
            div = divider*-1;
        }else if(number < 0 && divider > 0){
            result = number*-1;
            div = divider;
        }else if(number > 0 && divider < 0){
            result = number;
            div = divider*-1;
        }else{
            try{
                throw new RuntimeException("Cannot divide 0");
            }catch (RuntimeException e){
                e.printStackTrace();
            }
                result = -1;
                div = 0;
        }

        while (result-div > -1) {
            result -= div;
            n++;
        }
        int decimal = result*100;

        while (decimal-div > -1){
            decimal-=div;
            n2++;
        }
        n2 = n2 * 0.01;
        if( (number > 0 && divider > 0) || (number < 0 && divider < 0) ){
            System.out.println(df.format(n+n2));
        } else if( number == 0 || divider == 0) System.out.println("Zero");
        else System.out.println(df.format((n+n2)*-1));


    }

    public static void main(String[] args) {

        divide(24,-7);
        divide(-33, 12);
        divide(-10,-2);
        divide(3, 10);
        divide(0,10);
        divide(10, 0);
    }
}
