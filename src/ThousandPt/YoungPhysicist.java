package ThousandPt;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[3];
        for(int i = 0; i < n; i++){
            arr[0] += input.nextInt();
            arr[1] += input.nextInt();
            arr[2] += input.nextInt();
        }

        if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }
}
