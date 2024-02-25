import java.io.*;
import java.util.*;

public class Main {
    static int n,s,ans;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int cumSum = 0;
            int j = i;
            
            while(j <= n && cumSum < s){
                cumSum += arr[j];
                j++;
            }
            // System.out.println(i + " => " + cumSum);
            ans = Math.min(ans, j - i + 1);

        }

        System.out.println(ans);

    }
}