import java.io.*;
import java.util.*;

public class Main {
	static int N,M,currK,maxK,currCount,maxCount;
	static int[][] map;
	static int[][] copy;
	static boolean[][] visited;
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	
	static int limit = 0; // 집의 최대 높이
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map  = new int[N][M];
		copy  = new int[N][M];
		visited  = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > limit)
					limit = map[i][j];
			}
		}
		
		maxK = 1;
		maxCount = 0;

		for (int k = 1; k < limit; k++) {
			initMap();
			initVisited();
			for (int i = 0 ; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] <= k ) {
						copy[i][j] = 0; // k보다 작으면 0(침수) 처리
						visited[i][j] = true;
					}
				}
			}
			
//			for (int d = 0; d < N;d++) {
//				System.out.println(Arrays.toString(copy[d]));
//			}
//			System.out.println();
			
			currCount = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (copy[i][j] == 1 && dfs(i,j)) {
						currCount++;
					}
				}
			}
			
//			System.out.println("currCount => " + currCount);
			
			if (currCount > maxCount) {
				// System.out.println("k가 " + k + "일 때 currCount => " + currCount);
				maxCount = currCount;
				maxK = k;
			}
			
		}
		
		System.out.println(maxK + " " + maxCount);
		
	}
	
	private static boolean dfs(int r, int c) {
		if (visited[r][c])
			return false;
		
		visited[r][c] = true;
		
		for (int d = 0; d < 4; d++) {
			int nr = dr[d] + r;
			int nc = dc[d] + c;
			if (!inRange(nr,nc) || visited[nr][nc] || copy[nr][nc] == 0)
				continue;
			dfs(nr,nc);
		}
		
		return true;
		
	}

	public static void initMap() {
		for (int i = 0; i < N; i++) 
			for (int j = 0; j < M; j++)
				copy[i][j] = 1;
	}
	
	public static void initVisited() {
		for (int i = 0; i < N; i++) 
			for (int j = 0; j < M; j++)
				visited[i][j] = false;
	}
	
	public static boolean inRange(int r, int c) {
		return 0 <= r && r < N && 0 <= c && c < M;
	}
}