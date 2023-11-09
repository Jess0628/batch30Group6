package week6_JavaCodingTasks.danil;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum("1ljksa3adsf4fh5alskjdf"));
    }
    public static int sum(String input){
        int result = 0;
        for(Character e : input.toCharArray()){
            if(Character.isDigit(e)){
                result+=Integer.parseInt(e+"");
            }
        }
        return result;
    }
}
