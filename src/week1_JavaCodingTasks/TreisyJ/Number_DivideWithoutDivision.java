package week1_JavaCodingTasks.TreisyJ;

public class Number_DivideWithoutDivision {

    public static void main(String[] args) {

        int numberY = 60;
        int numberX = 20;
        int result = 0;

        if (numberX % numberY == 0) {
            for (; numberX > 0; numberX = numberX - numberY) ;
        }
        result++;

        System.out.println(numberX + "divide by " + numberY + "  is: " + result);


    }

}
// write a method which that can divide two numbers without using division operator

