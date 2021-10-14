import java.util.*;
import java.lang.*;
import java.io.*;

class sol{
    // Comparator<> compare = new Comparator<>() {
    //     @Override
    //     public int compare( a, b) {
    //         return;
    //     }
    // };
    static long fast_power(long base, long power) {
        long MOD = 1000000007L;
        long result = 1;
        while(power > 0) {

            if(power % 2 == 1) { // Can also use (power & 1) to make code even faster
                result = (result*base) % MOD;
            }
            base = (base * base) % MOD;
            power = power / 2; // Can also use power >>= 1; to make code even faster
        }
        return result;
    }
    public static void  solve(){
        long n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextLong();
        System.out.println(fast_power(2,n));
    }
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
		int t=1;
        // t = sc.nextInt();
        while(t>0){
            solve();
            t--;
        }
    }
}