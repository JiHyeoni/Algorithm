import java.nio.Buffer;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack();
        boolean check=true;
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        int j=1;
        for(int i=0;i<n;i++){
            int number=Integer.parseInt(br.readLine());
            while (true){
                if(stack.isEmpty()){
                    stack.add(j++);
                    sb.append('+').append("\n");
                }
                if(number==stack.peek()){
                    stack.pop();
                    sb.append('-').append("\n");
                    break;
                }
                else if (number<stack.peek()){
                    check=false;
                    break;
                }
                else{
                    stack.add(j++);
                    sb.append('+').append("\n");
                }

            }

            if(check==false) break;
        }

       if(check==false) System.out.println("NO");
       else System.out.println(sb);
    }
}