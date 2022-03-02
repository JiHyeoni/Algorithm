import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Jewel implements Comparable<Jewel>{
    int m;
    int v;
    Jewel(int m,int v){
        this.m=m;
        this.v=v;
    }
    @Override
    public int compareTo(Jewel j){
        return this.m-j.m;
    }
}
class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        Jewel [] jewels=new Jewel[n];
        int [] bags=new int [k];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            int m=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            jewels[i]=new Jewel(m,v);
        }

        for(int i=0;i<k;i++){
            bags[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewels);
        Arrays.sort(bags);

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long maxValue=0;
        int index=0;

        for(int i=0;i<k;i++){
            while (index<n&&jewels[index].m<=bags[i]){
                pq.add(-jewels[index].v);
                index++;
            }
            if(!pq.isEmpty()){
                maxValue+=Math.abs(pq.poll());
            }
        }

        System.out.println(maxValue);
    }
}