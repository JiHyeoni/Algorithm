import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int [] deque=new int[200001];
        int front=10000;
        int back=10000;

        int n=s.nextInt();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            String str=s.next();
            if(str.equals("push_front")){
                int num=s.nextInt();
                front--;
                deque[front]=num;
            }
            else if(str.equals("push_back")){
                int num=s.nextInt();
                deque[back]=num;
                back++;
            }
            else if(str.equals("pop_front")){
                if(front!=back) {
                    sb.append(deque[front]).append("\n");
                    front++;
                }
                else sb.append(-1).append("\n");
            }
            else if(str.equals("pop_back")){
                if(front!=back){
                    sb.append(deque[back-1]).append("\n");
                    back--;
                }
                else sb.append(-1).append("\n");
            }
            else if(str.equals("size")){
                sb.append(back-front).append("\n");
            }
            else if(str.equals("empty")){
                if(front!=back) sb.append(0).append("\n");
                else sb.append(1).append("\n");
            }
            else if(str.equals("front")){
                if(front!=back) {
                    sb.append(deque[front]).append("\n");
                }
                else sb.append(-1).append("\n");
            }
            else if(str.equals("back")){
                if(front!=back){
                    sb.append(deque[back-1]).append("\n");
                }
                else sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);

    }
}