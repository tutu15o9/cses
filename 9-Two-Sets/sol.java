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

        int n = sc.nextInt();

        if( n%4 == 0 || (n+1) % 4 == 0){
            System.out.println( "YES");
            if (n % 2 == 1){
                int[] t1 = new int[n/2 +1];
                int[] t2 = new int[n/2];
                int t1i = 1,t2i = 0,i;
                t1[0] = 1;

                boolean sw = false;
                for(i = 2;i<= n/2;i++){
                    if(sw){
                        t1[t1i] = i;
                        t1[t1i + 1] = n - i + 2;
                        t1i += 2;
                    }else{
                        t2[t2i] = i;
                        t2[t2i + 1] = n - i + 2;
                        t2i += 2;
                    }
                    sw = !sw;
                }
                t1[n/2] = i;
                t2[n/2 - 1] = i+1;
                System.out.println(n/2 + 1);
                for( i = 0;i< n/2 +1;i++){
                    System.out.print( t1[i] + " ");
                }
                System.out.println("\n" + n/2 );
                for( i = 0;i< n/2 ;i++){
                    System.out.print( t2[i] + " ");
                }
                System.out.println();
            }else{
                int[] t1 = new int[n/2];
                int[] t2 = new int[n/2];
                int t1i = 0,t2i = 0;
                int i;
                boolean sw = false;
                for(i = 1;i<= n/2;i++){
                    if(sw){
                        t1[t1i] = i;
                        t1[t1i + 1] = n - i + 1;
                        t1i += 2;
                    }else{
                        t2[t2i] = i;
                        t2[t2i + 1] = n - i + 1;
                        t2i += 2;
                    }
                    sw = !sw;
                }
                System.out.println(n/2);
                for( i = 0;i< n/2;i++){
                    System.out.print( t1[i] + " ");
                }
                System.out.println("\n" + n/2 );
                for( i = 0;i< n/2 ;i++){
                    System.out.print( t2[i] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("NO");
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