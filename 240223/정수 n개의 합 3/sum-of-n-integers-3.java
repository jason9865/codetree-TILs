import java.io.*;
import java.util.*;

public class Main {

    static int n,k;
    static int[][] arr;
    static int[][] prefixSum;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        prefixSum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) 
            prefixSum[i][1] = arr[i][1];
        
        for (int i = 1; i <= n; i++)
            prefixSum[1][i] = arr[1][i];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + 
                                  prefixSum[i][j - 1] - 
                                  prefixSum[i - 1][j - 1] + 
                                  arr[i][j];
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int i = k; i <= n; i++) {
            for (int j = k; j <= n; j++) {
                int sum = prefixSum[i][j] -
                          prefixSum[i - k][j] -
                          prefixSum[i][j - k] +
                          prefixSum[i - k][j - k];
                ans = Math.max(ans,sum);
            }
        }

        System.out.println(ans);


    }
}