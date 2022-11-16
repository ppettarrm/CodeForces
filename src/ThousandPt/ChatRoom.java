package ThousandPt;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        boolean letH = false, letE = false, letL1 = false, letL2 = false, letO = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'h' && !letH)
                letH = true;
            else if(s.charAt(i) == 'e' && !letE && letH)
                letE = true;
            else if(s.charAt(i) == 'l' && !letL1 && letE)
                letL1 = true;
            else if(s.charAt(i) == 'l' && !letL2 && letL1)
                letL2 = true;
            else if(s.charAt(i) == 'o' && !letO && letL2)
                letO = true;
        }

        if(letO)
            System.out.println("YES");
        else
            System.out.println("NO");
        input.close();
    }
}
