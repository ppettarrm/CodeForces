package ThousandPt;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String output = "";

        for(int i = 0; i < s.length(); i++){
            if(!isVowel(s.charAt(i))){
                char c;
                if(s.charAt(i) < 92)
                    c = (char) (s.charAt(i) + 32);
                else
                    c = s.charAt(i);

                output += "." + c;
            }
        }

        System.out.print(output);
        input.close();
    }

    private static boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
           || c == 'I' || c == 'o' || c == 'O' || c =='u' || c == 'U' || c == 'y' || c == 'Y')
                return true;
        else
                return false;

    }
}
