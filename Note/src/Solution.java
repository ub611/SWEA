
import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	static int input[];
	static int count;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 1;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			count = sc.nextInt();
			input = new int[100];
			
			for(int i = 0; i < input.length; i++) {
				input[i] = sc.nextInt();
			}
			
			int gIdx = input.length - 1;
			int tIdx = 0;
			
//			Arrays.sort(input);

			for(int i = 0; i < count; i++) {
				Arrays.sort(input);
				
				input[gIdx]--;
				input[tIdx]++;
				
				
				if(gIdx - 1 > 0) {
					if(input[gIdx] <= input[gIdx - 1])
						gIdx--;
				}
				
				if(tIdx + 1 < input.length) {
					if(input[tIdx] <= input[tIdx + 1])
						tIdx++;
				}
				

				if(input[0] - input[input.length - 1] <= 1)
					break;
			}
	
			print(input);
			System.out.println(input[gIdx] - input[tIdx]);

		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
	}
}