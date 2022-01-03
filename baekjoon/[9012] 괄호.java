import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<t;i++){
            String str=br.readLine();
            boolean check=true;

            for(int k=0;k<str.length();k++){
                if(str.charAt(k)=='('){
                    stack.add('(');
                }
                else{
                    if(!stack.isEmpty()) stack.pop();
                    else{
                        check=false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()||check==false) System.out.println("NO");
            else System.out.println("YES");

            stack.clear();
        }

    }
}