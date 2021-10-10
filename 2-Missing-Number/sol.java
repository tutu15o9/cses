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
        long size = sc.nextLong();
        long sol = 0;
        for(long i = 0; i< size -1; i++){
            long t = sc.nextLong();
            sol ^= (i+1)^t;
        }
        System.out.println((sol^size));
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