import java.util.Scanner;

class Greatings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        String uname = name.toUpperCase();
        System.out.println("Hello," + uname + ",nice to meet you!");
        s.close();
    }
}