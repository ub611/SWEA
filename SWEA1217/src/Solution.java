
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	static int m;
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int tc = sc.nextInt();
			int n = sc.nextInt();
			m = sc.nextInt();
			
			System.out.println("#" + tc + " " + pow(n, 0));
			
			
		
		}
	}
	
	public static int pow(int n, int cnt) {
		if(cnt == m)
			return 1;
		
		return n * pow(n, cnt + 1);
	}
}