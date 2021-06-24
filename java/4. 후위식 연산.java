import java.util.*;
class Main {	
	public int solution(String str){
		int answer=0;
		Stack<Integer> stack=new Stack<>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(Character.getNumericValue(x));
			else {
				int num1=stack.pop();
				int num2=stack.pop();
				
				if(x=='*') answer=num2*num1;
				else if (x=='/') answer=num2/num1;
				else if (x=='-') answer=num2-num1;
				else if(x=='+') answer=num2+num1;
				stack.push(answer);
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