import java.util.*;

public class Main {
	
	public int solution( int n,int [][] arr) {
		int answer=Integer.MIN_VALUE;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++) {
			sum1=0;
			sum2=0;
			for(int j=0;j<n;j++)
			{
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			if(answer<sum1) answer=sum1;
			if(answer<sum2) answer=sum2;
			
		}

		 sum1=0;
		 sum2=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i][i];
			sum2+=arr[n-i-1][i];
		}
		if(answer<sum1) answer=sum1;
		if(answer<sum2) answer=sum2;

		
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int [][] arr=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			arr[i][j]=kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n, arr));

	}
}
	

