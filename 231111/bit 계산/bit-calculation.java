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
    		q = 0;
    	} else {
    	    String cmd = str.split(" ")[0];
            int num = Integer.parseInt(str.split(" ")[1]);
    		if (cmd.equals("add")){
                if (((q >> num) & 1) == 0)
    			    q = q ^ (1 << num);
    		}
    		if (cmd.equals("delete")){
                if (((q >> num) & 1) == 1)
    			    q = q ^ (1 << num);
    		}
    		if (cmd.equals("toggle"))
    			q = q ^ (1 << num);
    		if (cmd.equals("print")){
    			int temp = (q >> num) & 1;
    			System.out.println(temp);
    		}
    	}
        
    }

}