import java.util.*;

public class Main {

	public int solution(int n, int[] m) {
		int answer=0;
		int t=0;
		for (int i=0;i<n;i++)
		{
			if(t<m[i])
			{
				t=m[i];
				answer++;
			}
		}
		

		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int [] m=new int[n];
		for (int i=0;i<n;i++)
		{
			m[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m));
	}
	
}
