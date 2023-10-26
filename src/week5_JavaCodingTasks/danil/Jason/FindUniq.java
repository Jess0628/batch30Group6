package week5_JavaCodingTasks.danil.Jason;

public class FindUniq {

    public static void main(String[] args) {
        String str = "AABBSSDDEHHJ";
        String uniq = "";


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)){
                uniq += each;
            }
        }

        System.out.println(uniq);
    }

}
