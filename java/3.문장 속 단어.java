import java.util.*;

public class Main {

	public String solution(String str) {
		String answer="";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos=str.indexOf(' '))!=-1)
		{
			String tmp=str.substring(0,pos);
			int len=tmp.length();
			
			if(len>m)
			{
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		
		/*
		int m=Integer.MIN_VALUE;
		String s[]=str.split(" ");
		
		for (String x : s )
		{
			int len=x.length();
			if (m<len)
			{
				m=len;
				answer=x;
			}
		}
		*/
		
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		
		System.out.print(T.solution(str));
		System.out.println();
				
	}
	
}
