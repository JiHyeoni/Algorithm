import java.util.*;
class Main {	
	public String solution(String str1, String str2){
		String answer="YES";
		Queue <Character> Q=new LinkedList<>();
		for (char x : str1.toCharArray()) {
			Q.offer(x);
		}
		for(char x: str2.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		
		/*
		Queue <Character> Q1=new LinkedList<>();
		Queue <Character> Q2=new LinkedList<>();
		
		for(char x : str1.toCharArray()) {
			Q1.offer(x);
		}
		for (char x : str2.toCharArray()) {
			Q2.offer(x);
		}
		
		while(!Q2.isEmpty()) {
			if(Q2.poll()==Q1.peek()) Q1.poll();
		}
		
		if(Q1.isEmpty()) answer="YES";
		else answer="NO";
		*/
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		String str1=kb.next();
		String str2=kb.next();
		
		System.out.println(T.solution(str1,str2));
	}
}

/*
import java.util.*;
class Main {	

	public String solution(String str1,String str2){
		String answer="YES";
		Queue <Character> Q=new LinkedList<>();
		for(char x : str1.toCharArray()) Q.offer(x);
		
		for(char x:str2.toCharArray()) {
			if(Q.contains(x)) {
				if(Q.peek()==x) Q.poll();
				else return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
	
		String str1=kb.next();
		String str2=kb.next();
		
		System.out.println(T.solution(str1,str2));
	}
}
*/