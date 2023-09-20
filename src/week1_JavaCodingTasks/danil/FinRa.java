package week1_JavaCodingTasks.danil;

public class FinRa {
    public static void runner(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print("FinRa ");
            else if (i % 5 == 0) System.out.print("Ra ");
            else if (i % 3 == 0) System.out.print("Fin ");
            else System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void finRa(int n) {

        if (n == 0) {
            try {
                throw new NullPointerException("Cannot process 0");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }else if (n < 0) {
            runner(n*-1);
        }else{
            runner(n);
        }
    }

    public static void main(String[] args) {
        finRa(30);
        finRa(-30);
        finRa(0);
    }
}
