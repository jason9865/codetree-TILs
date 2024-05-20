import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;
    static int n,m;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(br.readLine());

            binarySearch(t);
        }

    }

    private static void binarySearch(int target){
        int left = 0;
        int right = n - 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            } else if(arr[mid] > target){
                right = mid - 1;
            } else{
                ans = mid + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}