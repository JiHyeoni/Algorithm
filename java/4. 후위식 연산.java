import java.util.*;
class Main {	
	public int solution(String str){
		int answer=0;
		Stack <Integer> stack=new Stack<>();
		for(char x : str.toCharArray()) {
			
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				int num1=stack.pop();
				int num2=stack.pop();
				if(x=='+') stack.push(num2+num1);
				else if(x=='-') stack.push(num2-num1);
				else if(x=='*') stack.push(num2*num1);
				else if(x=='/') stack.push(num2/num1);
					}
		}
		answer=stack.pop();

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		
		System.out.println(T.solution(str));
	}
}