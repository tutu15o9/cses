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
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    public static void  solve()throws java.lang.Exception{
        long a ,b ;
        String[] input = bufferedReader.readLine().split(" ");
        a = Long.parseLong(input[0]);
        b = Long.parseLong(input[1]);
        if( a > 2*b || b > 2*a || (a+b) %3 != 0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		int t=1;
        t = Integer.parseInt(bufferedReader.readLine());
        while(t>0){
            solve();
            t--;
        }
    }
}