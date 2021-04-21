import java.util.*;

public class Main {

	public ArrayList<Integer> solution(int n, int[] m) {
		ArrayList<Integer> answer=new ArrayList<>();
		answer.add(m[0]);
		
		for(int i=1;i<n;i++)
		{
			if(m[i]>m[i-1])
			{
				answer.add(m[i]);
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
		for ( int k : T.solution(n, m))
		{
			System.out.print(k+" ");
		}
	}
	
}
