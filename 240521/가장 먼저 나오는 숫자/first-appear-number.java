import java.io.*;
import java.util.*;

public class Main {

    static final int MAX_N = 100_000;
    static int n,m;
    static int[] arr = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < m; i++){
            int target = Integer.parseInt(st.nextToken());
            getFirstAppear(target);
        }


    }

    private static void getFirstAppear(int target) {
        int left = 0;
        int right = n - 1;
        int minIdx = n;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= target) {
                right = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                left = mid + 1;
            }

        }
        if (arr[minIdx] == target){
            System.out.println(minIdx + 1);
            return;
        }

        System.out.println(-1);
        
    }

}