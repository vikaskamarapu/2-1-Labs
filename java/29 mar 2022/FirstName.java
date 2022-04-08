import java.util.Scanner;

class FirstName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your First name :");
        String name = s.nextLine();
        String arr[] = name.split(" ");
        for (String v : arr) {
            System.out.println(v + " " + v.length());
        }
        System.out.println("initials :" + arr[0].charAt(0) + "\n" + arr[1].charAt(0));
        s.close();
    }
}