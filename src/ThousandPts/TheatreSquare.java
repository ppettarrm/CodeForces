package ThousandPts;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, m, a;
        n = input.nextInt();
        m = input.nextInt();
        a = input.nextInt();

        long w, l;
        if(n % a == 0)
            w = n / a;
        else
            w = n / a + 1;

        if(m % a == 0)
            l = m / a;
        else
            l = m / a + 1;

        System.out.println(w * l);

        input.close();
    }
}
