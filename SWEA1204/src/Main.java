import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		
		//bf - scan + sort + count
		//map - scan + search + sort
	//	for(int test_case = 1; test_case <= T; test_case++)
		{
			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
            for(int i = 0 ; i < 1000; i++){
            		int t = sc.nextInt();
            	
            		if(m.get(t) == null) {
            			m.put(t, 0);
            		}
            		else {
            			m.put(t, m.get(t) + 1);
            		}
            }
            
            Iterator<Integer> it = m.keySet().iterator();
            int ans = it.next();
            
            while(it.hasNext()) {
            	
            		int t = it.next();
            		
            		if(m.get(t) > m.get(ans)) {
            			ans = t;
            		}
            		
            		else if (m.get(t) == m.get(ans)) {
            			if(t > ans)
            				ans = t;
            		}
            }
        
			System.out.println(ans);
		
		}
	}
}
