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
    public static void  solve(){
        long n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextLong();
        System.out.println(0);         
        for(long i = 2;i<=n;i++){
            
            long total = ((i*i)*(i*i - 1)/2)  ;
            total -= (2 + 2*(i-2))*(i-2);
            total -= (4 + 2*(i-4))*(i-1);
            System.out.println(total) ; 
        }
        
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