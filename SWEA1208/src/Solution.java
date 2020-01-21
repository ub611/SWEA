
import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	static int input[];
	static int count;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			count = sc.nextInt();
			input = new int[100];
			
			for(int i = 0; i < input.length; i++) {
				input[i] = sc.nextInt();
			}
			
			int maxid = input.length - 1;
			int minid = 0;
			
			Arrays.sort(input);
			int max = input[input.length - 1];
			int min = input[0];
			
			for(int i = 0; i < count; i++) {				
				input[maxid]--;
				input[minid]++;
				
				Arrays.sort(input);
				max = input[input.length - 1];
				min = input[0];

				if(max - min <= 1)
					break;
				
			}
			
		//	print(input);
			System.out.println("#" + test_case + " " + (max - min));
			
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
	}
}