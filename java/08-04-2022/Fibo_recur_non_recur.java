import java.util.Scanner;

public class Fibo_recur_non_recur {
    int a = 1;
    int b = 1;
    int c = 0;
    int count;

    int input(int n) {
        count = n;
        count = fabo(count);
        return count;
    }

    int fabo(int count) {
        if (count != 2) {
            c = a + b;
            a = b;
            b = c;
            fabo(--count);
        }
        return c;
    }

    public static void main(String args[]) {
        System.out.println("Enter the number n to print the faboniccs series :");
        Scanner ob = new Scanner(System.in);
        short n = ob.nextShort();
        Fibo_recur_non_recur o = new Fibo_recur_non_recur();
        int b = o.input(n);
        System.out.println("The " + n + "th number of the faboniccs series is " + b);
        ob.close();
    }
}
