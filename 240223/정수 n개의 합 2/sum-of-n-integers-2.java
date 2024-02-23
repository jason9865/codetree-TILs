import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] currSum = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        currSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            currSum[i] = arr[i] + currSum[i - 1];
        }

        int ans = Integer.MIN_VALUE;
        for (int i = k; i < n; i++) {
            int temp = currSum[i] - currSum[i-k]; 
            ans = Math.max(ans,temp);
        }

        System.out.println(ans);
    }
}