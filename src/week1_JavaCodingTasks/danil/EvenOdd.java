package week1_JavaCodingTasks.danil;

public class EvenOdd {
    public static boolean isEven(int n){
        if(n%2==0 && n!=0){
            System.out.println("Provided number is Even");
            return true;
        }else if(n==0){
            System.out.println("Provided number is Zero");
            return false;
        }else{
            System.out.println("Provided number is Odd");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean one = isEven(0);
        boolean two = isEven(44444);
        boolean three = isEven(33333);
        boolean four = isEven(-44444);


        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);
        System.out.println("four = " + four);
    }
}
