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
    public static void  solve() throws java.lang.Exception{
        String s = bufferedReader.readLine();
        Integer[] cnt = new Integer[26];
        Arrays.fill(cnt,0);
        int charA = 'A';
        for(char c : s.toCharArray()){
            cnt[(int)c - charA]++;
        }
        boolean oddPresent = false;

    	String start = "",mid ="",end = "";
        for(int i =0;i<26;i++){
            if(oddPresent && (cnt[i] %2 ==1)){
                System.out.print("NO SOLUTION\n");
                return;
            }
            if(cnt[i] %2 == 1){
                oddPresent = true;
                char[] repeat = new char[cnt[i]];
                Arrays.fill(repeat, (char)('A' + i));
                mid = new String(repeat);
            }else{
                char[] repeat = new char[cnt[i]/2];
                Arrays.fill(repeat, (char)('A' + i));
                start += new String(repeat);
            }
    	}
        System.out.println(start+ mid + new StringBuilder(start).reverse().toString());
    }
    public static void main (String[] args) throws java.lang.Exception{
        
		int t=1;
        // t = Integer.parseInt(bufferedReader.readLine());
        while(t>0){
            solve();
            t--;
        }
    }
}