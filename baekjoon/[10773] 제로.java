import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        int k=Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
            }
            else stack.add(num);
        }

        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);

    }
}