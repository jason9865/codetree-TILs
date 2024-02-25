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

        int cumSum = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            
            while(j + 1 <= n && cumSum < s){
                cumSum += arr[j + 1];
                j++;
            }
            
            if (cumSum < s)
                break;

            ans = Math.min(ans, j - i + 1);
            cumSum -= arr[i];

        }
        if (ans == Integer.MAX_VALUE) 
            ans = -1;

        System.out.println(ans);

    }
}