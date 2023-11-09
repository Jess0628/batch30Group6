package week6_JavaCodingTasks.danil;

public class ValidPassword {

    public static void main(String[] args) {
        System.out.println(validatePassword("Hello!6"));
    }
    public static boolean validatePassword(String password){
        boolean result = false;
        if(
                !password.contains(" ") &&
                        password.length()>6 &&
                        containsLowerCase(password) &&
                        containsUpperCase(password) &&
                        containsSpectialChar(password) &&
                        containsDigit(password)


        ){
            result = true;
        }
        return result;
    }

    public static boolean containsLowerCase(String password){
        boolean result = false;
        for(Character e : password.toCharArray()){
            if(Character.isLowerCase(e)) result = true;
        }
        return result;
    }

    public static boolean containsSpectialChar(String password){
        boolean result = false;
        for(Character e : password.toCharArray()){
            if(!Character.isLetter(e) && !Character.isDigit(e)) result = true;
        }
        return result;
    }

    public static boolean containsUpperCase(String password){
        boolean result = false;
        for(Character e : password.toCharArray()){
            if(Character.isUpperCase(e)) result = true;
        }
        return result;
    }

    public static boolean containsDigit(String password){
        boolean result = false;
        for(Character e : password.toCharArray()){
            if(Character.isDigit(e)) result = true;
        }
        return result;
    }
}
