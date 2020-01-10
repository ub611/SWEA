
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			String t = Integer.toString(i);
			if(t.contains("3") || t.contains("6") || t.contains("9")) {
				for(int j = 0; j < t.length(); j++) {
					if(t.charAt(j) == '3' || t.charAt(j) == '6' || t.charAt(j) == '9' )
						System.out.print("-");		//문제 잘 읽기 . . .
				}
				System.out.print(" ");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}