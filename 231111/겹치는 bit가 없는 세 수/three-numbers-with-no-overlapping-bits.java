import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine().trim());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        int max = 0;

        for (int i = 0; i < n;i++){
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i];
                    int y = arr[j];
                    int z = arr[k];

                    if (isOkay(x,y,z) && (x + y + z > max))
                        max = x + y + z;
                }
            }
        }

        System.out.println(max);


    }

    static boolean isOkay(int a, int b, int c){
        return ((a & b) == 0) && ((a & c) == 0) && ((b & c) == 0);
    }
}