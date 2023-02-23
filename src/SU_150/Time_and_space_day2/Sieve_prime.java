package SU_150.Time_and_space_day2;

public class Sieve_prime {
    static int count=0;
    public static void main(String[] args) {
      int n=1000;
      primeSieve(n);
        System.out.println("\n"+count);
    }
    public static void primeSieve(int n){
        boolean []prime=new boolean[n+1];
        //false --> prime
        //true --> not prime
        prime[0]=prime[1]=true;
        for (int i = 0; i*i < prime.length; i++) {
            if(prime[i]==false){
                for (int k = 2; k*i < prime.length ; k++) {
                    prime[i*k]=true;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if(prime[i]==false){
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
