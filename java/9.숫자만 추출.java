import java.util.*;

public class Main {

	public int solution(String str) {
		String answer="";
		char s[]=str.toCharArray();
		
		for (char x : s) {
			if (Character.isDigit(x)) 
			{ 
				answer+=x; }
			}
		return Integer.parseInt(answer);

		/*int answer=0;
		char s[]=str.toCharArray();
		
		for (char x : s) {
			if (Character.isDigit(x)) 
			{ 
				answer=answer*10+(x-48); }
			}
		return answer;*/
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution( str));
				
	}
	
}
