import java.util.*;
class Main {	
	public String solution(String s){
		String answer="";
		Stack<Character> stack=new Stack<>();
		
		for(char x: s.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(') {					
				}
			}
			else {
				stack.push(x);
			}
		}
		for(int i=0;i<stack.size();i++) answer+=stack.get(i);
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s=kb.next();
	
		System.out.println(T.solution(s));
	}
}