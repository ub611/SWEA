
import java.util.Scanner;
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
			String str = sc.next();
			StringBuilder sb = new StringBuilder();

			for(int i = 0; i < str.length(); i++) {
				sb.append(str.substring(i, i + 1));
				if(patternCheck(str, new String(sb))) {
					System.out.print("#" + test_case + " " + sb.length());
					break;
				}
			}
			System.out.println("");

		}
	}

	public static boolean patternCheck(String str, String p) {
		for(int i = 0; i < str.length() - p.length(); i += p.length()) {
//			System.out.println(i + " : " + "pattern check= " + p + " vs " + str.substring(i, i + p.length()));
			if(!p.equals(str.substring(i, i + p.length())))
				return false;
		}

		return true;
	}
}