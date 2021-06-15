import java.util.*;

public class Main {

	public int  solution(int n,int m, int [] arr) {
			int answer=0;
			int sum=0, lt=0;
			for(int rt=0;rt<n;rt++) {
				sum+=arr[rt];
				if(sum==m) answer++;
				while(sum>=m) {
					sum-=arr[lt++];
					if(sum==m) answer++;
				}
			}
			/*int sum=arr[0];
			int p1=0,p2=1;
			
			while(p2<n) {
				if(sum+arr[p2]<m) {
					sum+=arr[p2];
					p2++;
				}
				else if(sum+arr[p2]>m) {
					sum-=arr[p1];
					p1++;
				}
				else if(sum+arr[p2]==m) {
					sum+=arr[p2];
					p2++;
					answer++;
				}
			}*/
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
	

