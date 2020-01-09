
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 1; test_case++) //10 으로 고치기 
		{
			int len = sc.nextInt();
			int ans = 0;
			int[] arr = new int[len];
			
			for(int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 0;
			int dp[] = new int[len];
			
			for(int i = 2; i < len - 2; i++) {
				if(arr[i] > max) {
					max = arr[i];
					
					for(int j = i - 2; j <= i + 2; j++) {
						dp[j] = arr[i] - arr[j];
						
					//	System.out.print(j + " : " + dp[j] + " / " );
						
						if(j != i && dp[j] <= 0) {
							max = 0;
							dp = new int[len];
							break;
						}
					}
					
				//	System.out.println("");
					
					if(dp[i + 1] != 0) {
						int min = 256;

						for(int j = i - 2; j <= i + 2; j++) {
							if(dp[j] < min && dp[j] != 0)
								min = dp[j];
						}
						
						ans += min;
						max = 0;
					}
					
				}
			}
			
			System.out.println("#" + test_case + " " + ans);
		}
		
		
		
		sc.close();
	}
}