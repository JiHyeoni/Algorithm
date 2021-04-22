import java.util.*;

public class Main {
	
	public int solution( int n,int [] m) {
		int answer=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			if(m[i]==0) sum=0;
			else {
				sum+=1;
				answer+=sum;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int [] m=new int [n];
		for(int i=0;i<n;i++) {
			m[i]=kb.nextInt();
		}
		
		System.out.println(T.solution(n, m));

	}
}
	

