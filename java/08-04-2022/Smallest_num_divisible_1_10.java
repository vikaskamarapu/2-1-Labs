public class Smallest_num_divisible_1_10 {
    public static void main(String args[]) {

        for (int x = 10; x <= 3000; x = x + 10) {
            int count = 0;
            for (int i = 1; i <= 10; i++) {

                if (x % i == 0) {

                    count++;
                }
            }
            if (count == 10) {
                System.out.println("The Smallest number which is divisible by 1 to 10 :" + x);
                break;
            }
        }
    }
}
