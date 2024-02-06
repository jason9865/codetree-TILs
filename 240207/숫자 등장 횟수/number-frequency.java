import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        

        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
            
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            System.out.print(map.getOrDefault(num,0) + " ");
        }

    }
}