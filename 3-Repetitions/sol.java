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
        String dna = sc.next();

        long i = 1, sol = 1, curr = 1;
        while(i<dna.length()){
            if(dna.charAt((int)i-1) == dna.charAt((int)i)){
                curr++;
            }else{
                if(curr > sol){
                    sol = curr;
                }
                curr = 1;
            }
            i++;
        }
        if(curr > sol){
            sol = curr;
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