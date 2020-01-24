
import java.util.ArrayList;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T = 10;
//		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for(int i = 0; i < 8; i++) {
				int t = sc.nextInt();
				arr.add(t);
			}
			
			int mNum = 1;
	
			while(true) {
//				for(int tmp : arr) {
//					System.out.print(tmp + " ");
//				}
//				System.out.println("");
//				
				if(mNum == 6) {
					mNum = 1;
				}
				
				int t = arr.remove(0) - mNum++;
				
				if(t < 0)
					t = 0;
				
				arr.add(t);
				
				if(t <= 0)
					break;
			}
			
			System.out.print("#" + test_case + " ");
			
			for(int i = 0; i < arr.size(); i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println("");
		}
	}
}