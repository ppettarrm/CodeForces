package ThousandPts;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();

        int max = x + y + z;

        if(x*y*z > max)
            max = x*y*z;
        if(x*(y+z) > max)
            max = x * (y + z);
        if((x + y) * z > max)
            max = (x + y) * z;
        if(x * y + z > max)
            max = x * y + z;
        if(z * y + x > max)
            max = z * y + x;

        System.out.println(max);


        input.close();
    }

}
