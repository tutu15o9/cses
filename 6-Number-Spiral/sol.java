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
    public static void  solve() throws IOException{
      

    }
    public static void main (String[] args) throws java.lang.Exception
	{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
 
		int t=1;
        t = Integer.parseInt(bufferedReader.readLine());;
        while(t>0){
            long x ,y ,sol;
            String[] input = bufferedReader.readLine().split(" ");
            y = Long.parseLong(input[0]);
            x = Long.parseLong(input[1]);
    
            if(y > x){
                if(y%2 == 1){
                    sol = (y-1)*(y-1) + x ;
                }else{
                    sol = y*y - x + 1;;
                }
            }else{
                if(x%2 == 1){
                    sol = (x)*(x) - y + 1;
                }else{
                    sol = (x-1)*(x-1) + y;
                }
            }
            System.out.println(sol);
            t--;
        }
    }
}