import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        Queue <Integer> queue=new LinkedList<>();

        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll();
            if(queue.size()==1) break;
            queue.offer(queue.poll());
            if(queue.size()==1) break;
        }
        System.out.println(queue.poll());
    }
}