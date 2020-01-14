import java.util.*;
import java.io.FileInputStream;

class Solution
{
	static int[][] dp;
	static int ans;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.next();
			int cnt = sc.nextInt();
			dp = new int[cnt + 1][1000000];	//최대 여섯자리
			ans = 0;
			
			dfs(input.toCharArray(), 0, cnt);
			
			System.out.println("#"+test_case + " " + ans );
			
		}
		
		sc.close();
	}
	
	public static void dfs(char[] arr, int now, int cnt) {
		if(now == cnt) {
			ans = ans < getInt(arr) ? getInt(arr) : ans;		// brute-force로 모든 경우 봤으니깐, 가장 큰 값을 ans 에 저장하면 그게 정답
			return;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {		//두개르 ㄹ교환할거니깐 
			for(int j = i + 1; j < arr.length ; j++) {
				char[] tarr = swap(arr, i, j);
				if(dp[now+1][getInt(tarr)] == 0) {
					dp[now+1][getInt(tarr)] = 1;
					dfs(tarr, now + 1, cnt);
				}
			}
		}
	}
	
	public static char[] swap(char[] arr, int x, int y) {
		char[] tarr = arr.clone();
		char tmp = tarr[x];
		tarr[x] = tarr[y];
		tarr[y] = tmp;
		
		return tarr;
	}
	
	public static int getInt(char[] a) {
		return Integer.parseInt(new String(a));
	}

}