import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the expression :");
            String ex = s.nextLine();
            if (ex.equals("0")) {
                break;
            } else {
                String arr[] = ex.split(" ");
                // for(String v: arr)
                // System.out.println(v);
                float x = Float.parseFloat(arr[0]);
                float y = Float.parseFloat(arr[2]);
                if(arr[1].equals("+")) {
                    System.out.println(ex + " :" + (x + y));
                } else if (arr[1].equals("-")) {
                    System.out.println(ex + " :" + (x - y));
                } else if (arr[1].equals("*")) {
                    System.out.println(ex + " :" + (x * y));
                } else if (arr[1].equals("/")) {
                    System.out.println(ex + " :" + (x / y));
                } else {
                    System.out.println("plese enter correct expression..");
                }
            }
        }
        s.close();
    }
}
