public class Twinprimes {
    public static void main(String[] args) {
        boolean isPrime[]=new boolean[1001];
        for(int i=2; i*i<=1000; i++){
            if(isPrime[i]==false){
                for(int j=i*i; j<=1000; j+=i){
                    isPrime[j]=true;
                }
            }
        }
        System.out.println("The Twin primes are :");
        for(int i=2; i<=998; i++){
            if((isPrime[i]==false) && (isPrime[i+2]==false)){
                System.out.println(i+" "+(i+2));
            }
        }
    }
}
