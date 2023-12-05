import java.util.*;
import java.io.*;

class Pair{
    int x,y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// 1. 현재 위치로부터 이동 가능한 칸을 전부 찾는다.
// 2. 도달 할 수 있는 칸 중 가장 우선순위가 높은 칸의 위치 구한다
// 2-1 도달 가능한 칸이 있다면 현재 칸의 위치를 해당 위치로 옮겨준다
// 2-2 도달 가능한 칸이 없다면 움직이는 것을 종료한다.

public class Main {
        public static final Pair NOT_EXISTS = new Pair(-1,-1);
		public static final int DIR_NUM = 4;
		public static final int MAX_N = 100;

		public static int n,k;

		public static int[][] grid = new int[MAX_N][MAX_N];

		// 현재 위치
		public static Pair currCell;

		public static Queue<Pair> bfsQ = new LinkedList<>();
		public static boolean[][] visited = new boolean[MAX_N][MAX_N];

		public static boolean inRange(int x, int y) {
			return 0 <= x && x < n && 0 <= y && y < n;
		}

		public static boolean canGo(int x,int y, int targetNum) {
			return inRange(x,y) && !visited[x][y] && grid[x][y] < targetNum;
		}

		// visited 배열 초기화
		public static void initializeVisited() {
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < n; j++) 
					visited[i][j] = false;
		}

		public static void BFS() {
			int[] dx = new int[]{0,1,0,-1};
			int[] dy = new int[]{1,0,-1,0};

			int cX = currCell.x;
			int cY = currCell.y;

			visited[cX][cY] = true;
			bfsQ.add(currCell);

			int targetNum = grid[cX][cY];

			while (!bfsQ.isEmpty()) {
				Pair currPos = bfsQ.poll();
				int currX = currPos.x;
				int currY = currPos.y;

				for (int i = 0; i < DIR_NUM;i++) {
					int newX = currX + dx[i];
					int newY = currY + dy[i];

					if (canGo(newX, newY, targetNum)) {
						bfsQ.add(new Pair(newX, newY));
						visited[newX][newY] = true;
					}
				}
			}

		}

		public static boolean needUpdate(Pair bestPos, Pair newPos) {
			if (bestPos.x == NOT_EXISTS.x && bestPos.y == NOT_EXISTS.y)
				return true;

			int bestX = bestPos.x;
			int bestY = bestPos.y;

			int newX = newPos.x;
			int newY = newPos.y;

			if (grid[newX][newY] != grid[bestX][bestY])
				return grid[newX][newY] > grid[bestX][bestY];
			if(-newX != -bestX)
				return -newX > -bestX;
			return -newY > -bestY;

		}

		static boolean move() {
			initializeVisited();

			BFS();

			Pair bestPos = NOT_EXISTS;
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < n; j++ ){
					if(!visited[i][j] || i == currCell.x && j == currCell.y) continue;
					Pair newPos = new Pair(i,j);
					if(needUpdate(bestPos, newPos))
						bestPos = newPos;
				}

			if (bestPos.x == NOT_EXISTS.x && bestPos.y == NOT_EXISTS.y)
				return false;
			else {
				currCell = bestPos;
				return true;
			}
		}

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			for (int i = 0; i < n; i++){
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++){
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			currCell = new Pair(r-1,c-1);

			while(k-- > 0) {
				boolean isMoved = move();

				if (!isMoved)
					break;
			}

			int finalX = currCell.x;
			int finalY = currCell.y;

			System.out.print((finalX + 1) + " " + (finalY + 1));
		}



}