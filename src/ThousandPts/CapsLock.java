package ThousandPts;

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean checkFirstLower = false, checkAllUpper = true;

        for(int i = 0; i < s.length(); i++){
            if(i == 0 && s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
                checkFirstLower = true;
                checkAllUpper = false;
            } else {
                if(checkFirstLower && !(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                    checkFirstLower = false;
                if(checkAllUpper && !(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                    checkAllUpper = false;
            }
        }

        String output = "";
        if(checkFirstLower){
            for(int i = 0; i < s.length(); i++){
                if(i == 0)
                    output += (char) (s.charAt(0) - 32);
                else
                    output += (char) (s.charAt(i) + 32);
            }
        }

        if(checkAllUpper){
            for(int i = 0; i < s.length(); i++){
                output += (char) (s.charAt(i) + 32);
            }
        }

        if(!checkAllUpper && !checkFirstLower)
            output = s;

        System.out.println(output);

        input.close();
    }

}
