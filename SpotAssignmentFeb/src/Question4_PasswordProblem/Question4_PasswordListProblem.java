package Question4_PasswordProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4_PasswordListProblem {
    public static void main(String[] args) {

        String [] passwords = {"because","can","do","must","we","what"};
        String loginAttempt = "wedowhatwemustbecausewecan";
        String temporary = loginAttempt;
        String answer1 = "";
        String answer2 = "";
        ArrayList<String> passwordList = new ArrayList<>(Arrays.asList(passwords));

        for(String password : passwords) {
            loginAttempt = loginAttempt.replaceAll(password, "");
        }

        if(loginAttempt.equals("")) {
            for(int i=0;i<temporary.length();i++){
                char ch=temporary.charAt(i);
                answer1+=ch;

                if(passwordList.contains(answer1)){
                    answer2 = answer2+" "+answer1;
                    answer1="";
                }
            }
        }

        System.out.println(answer2);

    }
}
