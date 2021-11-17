import java.util.*;

class Main{
    public static StringBuilder sb=new StringBuilder();

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();

        sb.append((int)(Math.pow(2,k)-1)).append('\n');

        Hanoi(k,1,2,3);
        System.out.println(sb);
    }

    public static void Hanoi(int num, int from, int mid, int to){
        if(num==1){
            sb.append(from+" "+to+"\n");
            return;
        }
        else{
            Hanoi(num-1,from,to,mid);
            sb.append(from+" "+to+"\n");
            Hanoi(num-1,mid,from,to);
        }

    }
}