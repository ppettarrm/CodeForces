package ThousandPts;

import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt(), n = input.nextInt();
        int[] strenght = new int[n];
        int[] bonus = new int[n];

        int strenghtSum = s;
        for(int i = 0; i < n; i++){
            strenght[i] = input.nextInt();
            bonus[i] = input.nextInt();
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(strenght[j] > strenght[j + 1]){
                    int tempStr = strenght[j];
                    strenght[j] = strenght[j + 1];
                    strenght[j + 1] = tempStr;

                    int tempBon = bonus[j];
                    bonus[j] = bonus[j + 1];
                    bonus[j + 1] = tempBon;
                }
            }
        }

        boolean won = true;
        for(int i = 0; i < n; i++){
            strenghtSum += bonus[i];
            boolean check = s > strenght[i];
            if(check)
                s += bonus[i];
            if(!check)
                won = false;
        }

        if(strenghtSum == s && won)
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }
}
