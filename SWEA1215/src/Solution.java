import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int ans = 0;
			int size = sc.nextInt();
			String sarr[] = new String[8];

			for(int i = 0; i < sarr.length; i++) {
				sarr[i] = sc.next();
			}

			for(int i = 0; i < sarr.length; i++) {
				for(int j = 0; j <= sarr.length - size; j++) {
//					System.out.println(sarr[i].substring(j, j + size));
					ans += isPalin(sarr[i].substring(j, j + size));
				}
			}
			
//			sarr = new String[8];
//			int idx = 0;
			
			for(int i = 0; i < sarr.length;i++) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < sarr.length; j++) {
					sb.append(sarr[j].substring(i, i + 1));
				}
				
				for(int j = 0; j <= sarr.length - size; j++) {
					ans += isPalin(sb.substring(j, j + size));
				}
			}

			System.out.println("#" + test_case + " " + ans);

		}
	}

	public static int isPalin(String str) {
		char[] arr = str.toCharArray();

		for(int i = 0; i < arr.length/2; i++) {
			if(arr[i] != arr[arr.length - 1 - i])
				return 0;
		}

//		System.out.println(str);

		return 1;
	}
}