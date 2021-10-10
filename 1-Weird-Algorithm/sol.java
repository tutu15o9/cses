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
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();

        while(n!=1){
            System.out.print(n + " ");
            if(n%2 == 1){
                n = 3*n + 1;
            }else{
                n /= 2;
            }
        }
        System.out.println(1);
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