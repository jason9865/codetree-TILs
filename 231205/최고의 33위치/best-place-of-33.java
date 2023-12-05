import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int ans = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                // 해답에서는 얘를 함수로 묶음
                int temp = 0;
                for (int r = i; r < i + 3;r++) {
                    for (int c = j; c < j + 3; c++) {
                        temp += map[r][c];
                    }
                }
                //
                ans = Math.max(temp,ans);
            }
        } 

        System.out.print(ans);

    }
}