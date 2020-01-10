import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[][] input = new int[9][9];
			int ans = 1;

			for(int i = 0; i < input.length; i++) {
				for(int j = 0; j < input.length; j++) {
					input[i][j] = sc.nextInt();
				}
			}

			for(int i = 0; i < input.length; i++) {
				int[] tx = arr.clone();
				int[] ty = arr.clone();

				for(int j = 0; j < input.length; j++) {
					if(tx[input[i][j] - 1] == -1 || ty[input[j][i] -1] == -1) {
						ans = 0;
						break;
					}
					tx[input[i][j] - 1] = -1;
					ty[input[j][i] - 1] = -1;
				}

				if(ans == 0)
					break;
			}

			if(ans == 1) {
				for(int i = 0; i < input.length; i += 3) {
					for(int j = 0; j < input.length; j += 3) {
						int[] t = arr.clone();

						for(int x = i; x < i + 3; x++) {
							for(int y = i; y < i + 3; y++) {
								if(t[input[x][y] - 1] == -1) {
									ans = 0;
									break;
								}
								t[input[x][y] - 1] = -1;
							}

							if(ans == 0)
								break;
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + ans);

		}
	}
}