import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int input = sc.nextInt();
			int cnt = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();

			while(input > 0) {
				arr.add(input % 10);
				input = input / 10;
			}

			Collections.reverse(arr);
			int idx = 0;
			
			while(cnt > 0) {
				if(idx == arr.size()) {
					idx = 0;
				}
				int max = getMax(arr, idx); // 0바꾸
				
				int maxind = 0;
				int maxcnt = 0;
				
				for(int i = 0; i < arr.size(); i++) {
					if(arr.get(i) == max) {
						maxind = i;
						maxcnt++;
					}
					
					if(cnt == maxcnt) {
						break;
					}
				}
				
				int tmp = arr.get(maxind);
				arr.set(maxind, arr.get(idx));
				arr.set(idx, tmp);
				
				idx++;
				cnt--;
			}
			
			System.out.print("#"+test_case + " " + getMul(arr));
			
		}
	}
	public static int getMul(ArrayList<Integer> arr) {
		int ans = 0;
		int m = 1;
		
		for(int i = 0; i < arr.size(); i++) {
			ans += arr.get(i)*m;
			m*= 10;
		}
		
		return ans;
	}

	public static int getMax(ArrayList<Integer> arr, int idx) {
		int ans = 0;

		for(int i = idx; i < arr.size(); i++) {
			if(ans < arr.get(i)) {
				ans = arr.get(i);
			}
		}
		return ans;
	}
}