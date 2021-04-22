import java.util.*;

public class Main {
	
	public int solution( int n,int [][] arr) {
		int answer=0;
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
			if(arr[i-1][j]<arr[i][j] &&arr[i][j-1]<arr[i][j]&&arr[i+1][j]<arr[i][j]&&arr[i][j+1]<arr[i][j]) answer++;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int [][] arr=new int [n+2][n+2];
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
			arr[i][j]=kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n, arr));


	}
}
	

