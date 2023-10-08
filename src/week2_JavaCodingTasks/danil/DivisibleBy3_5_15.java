package week2_JavaCodingTasks.danil;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        String a = "Divisible by 15: ";
        String b = "Divisible by 5: ";
        String c = "Divisible by 3: ";
        for (int i = 1; i < 100; i++) {
            if(i%15==0) a+=i+", ";
            if(i%5==0) b+=i+", ";
            if(i%3==0) c+=i+", ";
        }

        a=a.trim().substring(0,a.length()-2)+".";
        b=b.trim().substring(0,b.length()-2)+".";
        c=c.trim().substring(0,c.length()-2)+".";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
