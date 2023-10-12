package week_1JavaTask;

public class DivideWithoutDividing {








        public static void divide(int num1,int num2){
            if(num2 == 0){
                System.out.println("invalid number");
                return;
            }


            int count =0 ;
            while(num1>=num2){
                num1 -= num2;
                count++;
            }
            System.out.println(count + " and remainder is "+ num1);
        }

    }
