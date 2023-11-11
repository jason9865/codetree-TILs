import java.io.*;
import java.util.*;

public class Main {
	
	static int q;
	
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            calc(str);
        }
    }

    static void calc(String str){
    	if (str.equals("clear")) {
    		q = 0; // 초기화
    	} else {
    	    String cmd = str.split(" ")[0];
            int num = Integer.parseInt(str.split(" ")[1]);
    		if (cmd.equals("add")){
                if (((q >> num) & 1) == 0) // q에 num이 있는지 확인
    			    q = q ^ (1 << num); // 없으면 num 추가
    		}
    		if (cmd.equals("delete")){
                if (((q >> num) & 1) == 1) // q에 num이 있는지 확인
    			    q = q ^ (1 << num); // 있으면 num 추가
    		}
    		if (cmd.equals("toggle"))
    			q = q ^ (1 << num); // 없으면 추가하고 있으면 빼준다.
    		if (cmd.equals("print")){
    			System.out.println((q >> num) & 1); // num이 있으면 1, 없으면 0 출력
    		}
    	}
        
    }

}