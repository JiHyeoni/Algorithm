import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str=br.readLine();
            if(str.equals(".")){
                break;
            }
            System.out.println(world(str));
        }

    }

    private static String world(String str) {
        Stack<Character> stack=new Stack<>();

        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)=='('|| str.charAt(i)=='[') stack.push(str.charAt(i));
            else if(str.charAt(i)==')'){
                if (stack.isEmpty()|| stack.peek()!='('){
                    return "no";
                }
                else stack.pop();
            }
            else if(str.charAt(i)==']'){
                if(stack.isEmpty()|| stack.peek()!='['){
                    return "no";
                }
                else stack.pop();
            }
        }

        if(!stack.isEmpty()) return "no";
        else return "yes";

    }
}