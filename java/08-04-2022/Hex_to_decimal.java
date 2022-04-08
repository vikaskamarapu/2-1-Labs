import java.util.Scanner;

public class Hex_to_decimal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the hexadecimal value :");
        String hex=s.nextLine();
        System.out.println("The Decimal value is :"+(Integer.parseInt(hex,16)));
        s.close();
    }
}
