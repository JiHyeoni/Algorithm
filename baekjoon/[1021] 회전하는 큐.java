import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> deque=new LinkedList<>();
        int n=s.nextInt();
        int m=s.nextInt();
        int [] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=s.nextInt();
        }
        for(int i=1;i<=n;i++){
            deque.offer(i);
        }
        int count=0;

        for(int i=0;i<m;i++){
            int target_idx=deque.indexOf(arr[i]);
            int half_idx=deque.size()/2;
            if(target_idx<=half_idx){
                for(int j=0;j<target_idx;j++){
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }
            else{
                for(int j=0;j<deque.size()-target_idx;j++){
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);

    }
}