import java.util.ArrayList;
import java.util.Scanner;

class Solution
{
	static int ans;
	static int n;


	// -------------완탐---------------
	static int arr[][];
	static int[] dx = {-1, 1, 1, -1};
	static int[] dy = {1, -1,  1, -1};

	static class Point{
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	//--------------------------------------

	static int[] map;		//무조건 한 줄에 하나만 들어갈 수 ㅣㅇㅆ으니깐 x = 배열 idx, y = 원소값으로 이용

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
			arr = new int[n][n];
			map = new int[n];
			ans = 0;

			queen(0, 0);

			System.out.println("#" + test_case + " " + ans);
		}
	}

	public static void queen(int cnt, int st) {
		if(cnt == n) {
			ans++;
//			print();
			return;
		}

		for(int i = 0; i < n; i++) {
			int iflag = 0;
			for(int j = 0; j < st; j++) {
//				if(map[j] == i || map[j] - (st - j) == i || map[j] + (st - j) == i) {
				if(map[j] == i || map[j] + st - j == i || map[j] - st + j == i) {
					iflag++;
					break;
				}
			}

			if(iflag == 0) {
				map[st] = i;
				queen(cnt + 1, st + 1);
			}
		}

	}







	//완탐으로 하면 시간초과 . .. . .. 
	public static void dfs(int st, int cnt) {
		if(cnt == n) {
			ans += check();
			return;
		}

		for(int i = st ; i < n * n; i++) {
			int tx = i / n;
			int ty = i % n;

			if(arr[tx][ty] == 0) {
				arr[tx][ty] = 1;
				dfs(i + 1, cnt + 1);
				arr[tx][ty] = 0;
			}
		}
	}


	public static int check() {
		int hcnt = 0;
		int vcnt = 0;

		ArrayList<Point> list = new ArrayList<Point>();

		for(int i = 0; i < n; i++) {
			vcnt = 0;
			hcnt = 0;
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 1) {
					vcnt++;
					list.add(new Point(i, j));
				}
				if(arr[j][i] == 1)
					hcnt++;
			}

			if(vcnt >= 2 || hcnt >= 2)
				return 0;
		}

		for(Point p : list) {

			for(int i = 0; i < 4; i++) {	
				int x = p.x;			//여기에서 할당해줘야지 대각선의 방향을 바꿀때마다 현재 x,y좌표부터 다시 시작함
				int y = p.y;

				while(true) {
					x = x + dx[i];
					y = y + dy[i];

					if(x < 0 || y < 0 || x == n || y == n)
						break;

					if(arr[x][y] == 1) 
						return 0;
				}
			}
		}

		return 1;

	}

	public static  void print() {

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(""); 

	}


}