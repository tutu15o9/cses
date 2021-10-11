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
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n == 1){
            System.out.println(1);
            return;
        }
        
        if(n == 4){
            System.out.println("2 4 1 3");
            return;
        }

        if(n==2 || n==3){
            System.out.println("NO SOLUTION");
        }
        String s1 = "",s2 = "";
        while( n > 0){
            s1 += n + " ";
            if(n>1)
                s2 += (n-1) + " ";
            n -= 2;
        }

        System.out.println(s1 + s2);

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