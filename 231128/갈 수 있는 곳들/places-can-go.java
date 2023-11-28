// package codetree;

import java.io.*;
import java.util.*;

public class Main {
	static class Node{
		int r;
		int c;
		public Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	static int n,k,count;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken())-1;
			if (!visited[r][c]) {
				visited[r][c] = true;
				bfs(r,c);
			}
		}
		
		System.out.println(count);
	}
	
	static boolean inRange(int r, int c) {
		return 0 <= r && r < n && 0 <= c && c < n;
	}

	private static void bfs(int r, int c) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(r,c));
		
		while (!queue.isEmpty()) {
			count++;
			Node curr = queue.poll();
			int currR = curr.r;
			int currC = curr.c;
			for (int d = 0; d < 4; d++) {
				int nr = currR + dr[d];
				int nc = currC + dc[d];
				if (!inRange(nr,nc) || visited[nr][nc] || map[nr][nc] == 1)
					continue;
				visited[nr][nc] = true;
				queue.offer(new Node(nr,nc));
			}
 		}
	}
}