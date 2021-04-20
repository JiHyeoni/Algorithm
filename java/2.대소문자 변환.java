import java.util.*;

public class Main {

	public String solution(String str) {
		String answer="";
		char ch[]=str.toCharArray();
		for (char x : ch) {
			if (Character.isUpperCase(x)) {
				answer=answer+Character.toLowerCase(x);
			}
			else
			{
				answer=answer+Character.toUpperCase(x);
			}
		}
		/*
		for(char x : str.toCharArray()){
			if(x>=97 && x<=122) answer+=(char)(x-32);
			else answer+=(char)(x+32);
		}
		 */

		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		
		System.out.print(T.solution(str));
		System.out.println();
				
	}
	
}
