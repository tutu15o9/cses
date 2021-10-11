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
        long size,prev,sol = 0,curr;
        Scanner sc=new Scanner(System.in);
        size = sc.nextLong();
        prev = sc.nextLong();
        for(long i = 1 ; i < size; i++){
            curr = sc.nextLong();
            if( prev > curr){
                sol += prev - curr;
            }else{
                prev = curr;
            }
        }

        System.out.println(sol);
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