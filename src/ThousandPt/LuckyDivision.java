package ThousandPt;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = n;

        boolean isLucky = true;
        if(isLucky) {
            while (n > 0) {
                if (n % 10 != 4 && n % 10 != 7) {
                    isLucky = false;
                    break;
                }

                n = n / 10;
            }
        }
        boolean dividedByLucky = true;
        if(!isLucky) {
            for(int i = 1; i < m && !isLucky; i++){
                int k = i;
                while(k > 0){
                    if (k % 10 != 4 && k % 10 != 7) {
                        dividedByLucky = false;
                        break;
                    }
                    k = k / 10;
                }
                if(dividedByLucky && m % i == 0)
                    isLucky = true;
                dividedByLucky = true;
            }

        }

        if(isLucky)
            System.out.println("YES");
        else
            System.out.println("NO");


        input.close();
    }
}
