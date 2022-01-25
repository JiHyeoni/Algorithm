import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Main {
    static int count=0;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        LinkedList<Integer> deque=new LinkedList<>();
        n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int [] arr=new int[m];
        for(int i=1;i<=n;i++){
            deque.offerLast(i);
        }
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++) {
            rotation(deque,arr[i]);
        }
        System.out.println(count);
    }
    public static void rotation(LinkedList<Integer> deque,int k){
        if(deque.peekFirst()==k){
            deque.pollFirst();
            return;
        }
        int half=deque.size()/2;
        int target=0;
        for(int i=0;i<deque.size();i++){
            if(deque.get(i)==k) target=i;
        }

        if(target>half){
            while(!deque.isEmpty()&&deque.peekFirst()!=k){
                deque.offerFirst(deque.pollLast());
                count++;
            }
        }
        else{
            while(!deque.isEmpty()&&deque.peekFirst()!=k){
                deque.offerLast(deque.pollFirst());
                count++;
            }
        }
        deque.pollFirst();
        return;

    }

}