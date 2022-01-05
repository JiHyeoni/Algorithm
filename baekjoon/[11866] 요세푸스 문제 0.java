import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int [] arr=new int[n];
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        int i=1;
        int j=0;
        while(!queue.isEmpty()){
            if(i==k){
                arr[j]=queue.poll();
                j++;
                i=1;
            }
            else{
                queue.offer(queue.poll());
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();

        sb.append("<");
        for (int r=0;r<n;r++){
            if(r==0) sb.append(arr[r]);
            else sb.append(", ").append(arr[r]);
        }
        sb.append(">");

        System.out.println(sb);
    }
}