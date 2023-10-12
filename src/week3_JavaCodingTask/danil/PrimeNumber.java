package week3_JavaCodingTask.danil;

public class PrimeNumber {

    public static String isPrime(int anyNumber){

        for(int i = 2; i<anyNumber; i++){
            if(anyNumber%i==0) return "is NOT a Prime Number";
        }
        return "is a Prime Number";
    }

    public static void main(String[] args) {
        for (int i = 2; i < 20; i++) {
            if(isPrime(i).contains("NOT")) System.out.println(i+" :"+isPrime(i));
            else System.err.println(i+" :"+isPrime(i));
        }
    }
}
