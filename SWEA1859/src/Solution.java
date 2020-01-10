import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			long arr[] = new long[n];
			long ans = 0;
			int item = 0;

			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			long tmpArr[] = arr.clone();
			int ind = 0;

			while(ind <= arr.length) {
				
				Arrays.sort(tmpArr, ind, arr.length);
				long max = tmpArr[arr.length - 1];
				int cnt = 0;
				
				for( ;  ind < arr.length; ind++) {
					if(arr[ind] == max ) {
						ans += max * cnt - item;
						
						tmpArr = arr.clone();
						item = cnt = 0;
						
						break;
						
					}else {
						item += arr[ind];
						cnt++;
					}
				}
				
				ind++;
			}

			System.out.println("#" + test_case + " " + ans);
		}
		
		sc.close();
	}
}