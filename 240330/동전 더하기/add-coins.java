import java.util.*;
import java.io.*;

public class Main {

    static int n,k;

    static int total = 0;
    static List<Integer> coins = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(coins,Collections.reverseOrder());

        for (int coin : coins){
            while (k >= coin) {
                k -= coin;
                total++;
            }
        }

        System.out.println(total);

    }
}