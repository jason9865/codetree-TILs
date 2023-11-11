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
                    // int x = arr[i];
                    // int y = arr[j];
                    // int z = arr[k];

                    // if (isOkay(x,y,z) && (x + y + z > max))
                    //     max = x + y + z;

                    // 해설 풀이
                    // 숫자들이 비트가 겹치지 않는다면
                    // 세 숫자의 합과 세 숫자의 or 연산의 값이 같습니다.
                    if(arr[i] + arr[j] + arr[k] == (arr[i] | arr[j] | arr[k]))
                        max = Math.max(max,arr[i] + arr[j] + arr[k]);
                }
            }
        }

        System.out.println(max);


    }

    static boolean isOkay(int a, int b, int c){
        return ((a & b) == 0) && ((a & c) == 0) && ((b & c) == 0);
    }
}