package week6_JavaCodingTasks.danil;

public class ValidPassword {
    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */

    public static void main(String[] args) {
        System.out.println(validatePassword("Hello!"));
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
            if(!Character.isLetterOrDigit(e))result = true;
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
