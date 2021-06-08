import java.util.*;

public class Main {
	public String  solution(int n, String str) {
		String answer="";
		/*
		 * int m=str.length()/n;
		int a=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(str.charAt(j)=='#') {
					a=a*2+1;
				}
				else if(str.charAt(j)=='*') {
					a=a*2;
				}
			}
			answer+=(char)a;
			a=0;
			str=str.substring(m);
		}	
		*/
		for(int i=0;i<n;i++) {
		String tmp=str.substring(0,7).replace('#','1').replace('*', '0');
		int num=Integer.parseInt(tmp,2);
		answer+=(char)num;
		str=str.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String str=kb.next();
		
		System.out.print(T.solution(n, str));
}
}
	

