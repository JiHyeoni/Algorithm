import java.util.*;
class Main {	
	public String solution(String s){
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(x=='(') stack.push(x);
			else if(x==')') {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s=kb.next();
	
		System.out.println(T.solution(s));
	}
}