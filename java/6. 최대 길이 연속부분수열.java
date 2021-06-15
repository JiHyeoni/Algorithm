import java.util.*;

public class Main {

	public int  solution(int n,int m, int [] arr) {
			int answer=0, cnt=0, lt=0;
			for(int rt=0;rt<n;rt++) {
				if(arr[rt]==0) cnt++;
				while(cnt>m) {
					if(arr[lt]==0) cnt--;
					lt++;
				}
				answer=Math.max(answer, rt-lt+1);
			}

			
			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n,m,arr));
}
}
	

