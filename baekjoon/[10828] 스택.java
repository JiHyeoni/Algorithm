import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] stack=new int[10001];
        int size=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            String str=s.next();
            if(str.equals("push")){
                int number=s.nextInt();
                size++;
                stack[size]=number;
            }
            else if(str.equals("size")){
                sb.append(size).append("\n");
            }
            else if (str.equals("empty")){
                if(size==0) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("pop")){
                if(size==0) sb.append(-1).append("\n");
                else sb.append(stack[size--]).append("\n");
            }
            else if(str.equals("top")){
                if(size==0) sb.append(-1).append("\n");
                else sb.append(stack[size]).append("\n");
            }
        }
        System.out.println(sb);


    }
}