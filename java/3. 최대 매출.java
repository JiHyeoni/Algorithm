import java.util.*;

public class Main {

	public int  solution(int n,int m, int [] arr) {
			int answer=0, sum=0;
			for(int i=0;i<m;i++) sum+=arr[i];
			answer=sum;
			for(int i=m;i<n;i++) 
			{
				sum+=(arr[i]-arr[i-m]);
				answer=Math.max(answer, sum);
			}
			
			/*
			 * for(int i=0;i<n-(m+1);i++) {
				int cnt=0;
				for(int j=0;j<m;j++) {
					cnt+=arr[i+j];
				}
				if(cnt>answer) {
					answer=cnt;
				}
			}
			*/
			
			return answer;
		
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
		
}
}
	

/*

import java.util.*;

public class Main {

	public int  solution(int n,int m, int [] arr) {
			int answer=0;
			int sum=0;
			for(int i=0;i<m;i++) {
				sum+=arr[i];
			}
			answer=sum;
			
			for(int i=m;i<n;i++) {
				
				sum+=(arr[i]-arr[i-m]);
				answer=Math.max(answer, sum);
				
			}

			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		int m=kb.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		
		System.out.print(T.solution(n, m, arr));

}
}
	


*/