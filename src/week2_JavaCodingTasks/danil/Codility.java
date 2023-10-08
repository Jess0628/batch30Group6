package week2_JavaCodingTasks.danil;

public class Codility {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            if(i%5==0||i%3==0 || i%2==0) {
                if (i % 5 == 0) System.out.print("Codility");
                if (i % 3 == 0) System.out.print("Test");
                if (i % 2 == 0) System.out.print("Coders");
                System.out.println();
            }
            System.out.println(i);
        }
    }
}
