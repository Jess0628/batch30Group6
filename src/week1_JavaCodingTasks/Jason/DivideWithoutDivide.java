package week1_JavaCodingTasks.Jason;

public class DivideWithoutDivide {
    public static int divide(int num1, int num2) {
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        return result;
    }
}
