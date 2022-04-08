public class Sum_Average_CommandLine {
    public static void main(String[] args) {
        int s=0;
        for(int i=0; i<args.length; i++){
            s+=Integer.parseInt(args[i]);
        }
        System.out.println("Sum of Numbers :"+s);
        System.out.println("Average is :"+(s/(args.length)));
    }
}
