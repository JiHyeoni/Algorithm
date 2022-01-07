import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String [] args) throws IOException{
        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       while(true){
           String str=br.readLine();
           if(str.equals(".")) break;
           Stack<Character> stack=new Stack<>();
           boolean check=true;
           for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='('||str.charAt(i)=='[') stack.add(str.charAt(i));
               else if(str.charAt(i)==')'){
                   if (stack.isEmpty()||stack.peek()=='['){
                       check=false;
                       break;
                   }
                   else stack.pop();
               }
               else if(str.charAt(i)==']'){
                   if (stack.isEmpty()||stack.peek()=='('){
                       check=false;
                       break;
                   }
                   else stack.pop();
               }
           }

           if(check==false||!stack.isEmpty()){
               sb.append("no").append("\n");
           }
           else{
               sb.append("yes").append("\n");
           }
       }

        System.out.println(sb);

    }
}