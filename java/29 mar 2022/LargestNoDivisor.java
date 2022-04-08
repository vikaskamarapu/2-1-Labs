public class LargestNoDivisor {
    public static void main(String[] args) {
        int ans = 0, m = 0, c = 0;
        for (int i = 1; i <= 10000; i++) {
            c = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c += 2;
                }
            }
            if (c > m) {
                m = c;
                ans = i;
            }
        }
        System.out.println("No of divisiors :" + m);
        System.out.println("No is :" + ans);
    }
}
