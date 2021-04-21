import java.util.*;

public class Main {

	public ArrayList<Character> solution(int n, int[] a, int[] b) {
		ArrayList<Character> answer=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if (a[i]==b[i]) answer.add('D');
			else if (a[i]==1) {
				if(b[i]==2) answer.add('B');
				else if(b[i]==3) answer.add('A');
			}
			else if(a[i]==2) {
				if (b[i]==1) answer.add('A');
				else if (b[i]==3) answer.add('B');
			}
			else if(a[i]==3)
			{
				if(b[i]==1) answer.add('B');
				else if(b[i]==2) answer.add('A');
			}
			
		}
		

		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int [] a=new int[n];
		int [] b= new int[n];
		for (int i=0;i<n;i++)
		{ a[i]=kb.nextInt();
		}
		for (int i=0;i<n;i++)
		{ b[i]=kb.nextInt();
		}
		for (char x : T.solution(n, a,b))
		{
			System.out.println(x);
		}
	}
	
}
