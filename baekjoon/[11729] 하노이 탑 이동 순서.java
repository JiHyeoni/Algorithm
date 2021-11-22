import java.util.*;

class Main{
    public static StringBuilder sb=new StringBuilder();
    public static void main(String []args){
        Scanner s=new Scanner(System.in);

        int k=s.nextInt();
        sb.append((int)Math.pow(2,k)-1);
        sb.append("\n");
        Hanoi(k,1,2,3);
        System.out.println(sb);
    }

    public static void Hanoi(int k, int from, int by, int to){
        if(k==1){
            sb.append(from+" "+to+"\n");
            return;
        }
        Hanoi(k-1,from,to,by);
        sb.append(from+" "+to+"\n");
        Hanoi(k-1,by,from,to);
    }
}