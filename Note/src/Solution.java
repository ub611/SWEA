import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 1;
		//		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			char[][] input = new char[8][8];
			int ans = 0;
			int size = sc.nextInt();
			String sarr[] = new String[8];

			for(int i = 0; i < sarr.length; i++) {
				//				String tstr = sc.next();
				sarr[i] = sc.next();
				input[i] = sarr[i].toCharArray();
			}

			for(int i = 0; i <= sarr.length - size; i++) {
				for(int j = 0; j <= sarr.length - size; j++) {
					//					System.out.println(i + ", " + j);
					//					int tmp = isPalin(sarr[i].substring(j, j + size));
					//					if(tmp == 1) {
					//						System.out.println("i = " + i + " j = " + j + " , " + (j + size));
					//					}
					ans += isPalin(sarr[i].substring(j, j + size));
					//					ans += isPalin(sarr[j].substring(i, i + size));
				}
			}

			for(int i = 0; i <= sarr.length - size; i++) {
				for(int j = 0; j <= sarr.length - size; j++) {
//					ans += isPalin(sar)
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

		System.out.println(str);

		return 1;
	}
}