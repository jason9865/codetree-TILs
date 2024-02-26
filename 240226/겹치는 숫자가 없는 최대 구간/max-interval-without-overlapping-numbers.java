import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] countArr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        countArr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            while (j + 1 <= n && countArr[arr[j + 1]] < 1) {
                countArr[arr[j + 1]]++;
                j++;
            }
            
            ans = Math.max(ans, j - i + 1);
            countArr[arr[i]]--;

        }
        
        System.out.println(ans);

    }
}