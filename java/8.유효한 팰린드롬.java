import java.util.*;

public class Main {

	public String solution(String str) {
		String answer="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer="YES";

		
		/*
		String answer="YES";
		str=str.toUpperCase().replaceAll("[^A-Z]","");
		int len=str.length();
		for (int i=0; i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
			
		}*/
		return answer;
	}
	public static void main(String[] args) {
		
		Main T=new Main();
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution( str));
				
	}
	
}
