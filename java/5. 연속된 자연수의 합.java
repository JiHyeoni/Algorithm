import java.util.*;

public class Main {

	public int  solution(int n) {
			int answer=0;
			int sum=0,lt=0,m=n/2+1;
			int [] arr=new int[m];
			for(int i=0;i<m;i++) arr[i]=i+1;
			
			for(int rt=0;rt<m;rt++) {
				sum+=arr[rt];
				if(sum==n) answer++;
				while(sum>=n) {
					sum-=arr[lt++];
					if(sum==n) answer++;
				}
			}
			
			/*int sum=0,lt=1;
			
			for (int rt=1;rt<n;rt++) {
				sum+=rt;
				if(sum==n) answer++;
				while(sum>=n) {
					sum-=lt++;
					if(sum==n) answer++;
				}
			}*/
			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.print(T.solution(n));
		
}
}
	

