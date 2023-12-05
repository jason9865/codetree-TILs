import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                int count = 0;
                if (map[i][j] != map[i][j + 1])
                    count = 0;
                else 
                    count++;
                // System.out.println(count);
                if (count >= m) 
                    ans++;
            }
        }

        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                int count = 1;
                if (map[j][i] != map[j+1][i])
                    count = 1;
                else 
                    count++;
                // System.out.println(count);

                if (count >= m) 
                    ans++;
            }
        }
        

        System.out.print(ans);
    }
}