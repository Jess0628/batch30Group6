package week3_JavaCodingTask.Jason;


public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime2(2));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPrime2(int num){

        while (num % 2 == 0){
            if (num != 2){
                return false;
            }
        }
        return true;
    }
}
