import java.util.*;

public class Main {

	public String solution(String str) {
		String answer="";
		str=str+" ";
		int cnt=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				answer+=str.charAt(i);
				if(cnt>1) answer+=String.valueOf(cnt);
				cnt=1;
			}
		}
		
		/*
		String answer="";
		int n=1;
		answer+=str.charAt(0);
		for (int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1))
			{
				n+=1;
			}
			else
			{
				if (n!=1) answer+=n;
				n=1;
				answer+=str.charAt(i);
			}
		}
		if (n!=1) answer+=n;
	*/
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
	
}
