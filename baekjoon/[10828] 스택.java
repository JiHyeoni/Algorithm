import java.io.IOException;
import java.util.*;

class Main{
    public static void main(String [] args) throws IOException{
        Scanner s=new Scanner(System.in);
        int [] stack=new int[10001];
        int point=0;
        int n=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            String str=s.next();
            if(str.equals("push")){
                int number=s.nextInt();
                stack[point]=number;
                point++;
            }
            else if(str.equals("pop")){
                if(point==0){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(stack[--point]).append("\n");
                }
            }
            else if(str.equals("size")){
                sb.append(point).append("\n");
            }
            else if(str.equals("empty")){
                if(point==0){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("top")){
                if(point==0){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(stack[point-1]).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}