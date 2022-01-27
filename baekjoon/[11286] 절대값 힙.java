import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

class absNumber implements Comparable<absNumber> {
    int number;
    int number_abs;

    absNumber(int number, int number_abs) {
        this.number = number;
        this.number_abs = number_abs;
    }

    public int compareTo(absNumber n) {
        if(this.number_abs==n.number_abs)
            return this.number-n.number;
        else
            return this.number_abs-n.number_abs;
    }

}

class Main {
    static long C;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<absNumber> pQueue=new PriorityQueue<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(br.readLine());
            if(x==0){
                if(pQueue.isEmpty()) sb.append(0).append("\n");
                else sb.append(pQueue.poll().number).append("\n");
            }
            else{
                pQueue.add(new absNumber(x,Math.abs(x)));
            }

        }

        System.out.println(sb);

    }


}
