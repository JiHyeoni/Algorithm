import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.PriorityQueue;


class Main {
    static long C;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQueue=new PriorityQueue<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(br.readLine());
            if(x==0){
                if(pQueue.isEmpty()) sb.append(0).append("\n");
                else sb.append(pQueue.poll()).append("\n");
            }
            else{
                pQueue.add(x);
            }

        }

        System.out.println(sb);

    }


}
