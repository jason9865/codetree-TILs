import java.io.*;
import java.util.*;

public class Main {

    static int n,k;
    static int[] arr;
    static int[] prefixSum;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int count = 0;

        for (int s = 1; s <= n; s++) {
            for (int i = 1; i <= n - s + 1; i++) {
                if (getPrefixSum(s,i) == k)
                    count++;
            }
        }

        System.out.println(count);

    }

    private static int getPrefixSum(int scope, int index) {
        return prefixSum[index + scope - 1] - prefixSum[index - 1];
    }

}