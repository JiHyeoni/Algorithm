import java.util.*;

public class Main {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer=new ArrayList<>();
		
		for(String x: str)
		{
			int lt=0;
			int rt=x.length()-1;
			char s[]=x.toCharArray();
			while(lt<rt)
			{
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			x=String.valueOf(s);
			answer.add(x);
			
		}
		
		/*for (String x:str)
		{
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/

		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		String str[]=new  String[num];
		for (int i =0;i<num;i++)
		{
			str[i]=kb.next();
		}
		for (String x : T.solution(num,str)) {
			System.out.print(x);
			System.out.println();
		}
				
	}
	
}
