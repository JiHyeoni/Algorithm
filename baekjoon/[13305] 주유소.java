
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        long distance[]=new long[n-1];
        long coin[] =new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n-1;i++){
            distance[i]=Long.parseLong(st.nextToken());
        }

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            coin[i]=Long.parseLong(st.nextToken());
        }

        for(int i=1;i<n;i++){
            if(coin[i-1]<coin[i]) coin[i]=coin[i-1];
        }

        long sum=0l;
        for(int i=0;i<n-1;i++){
            sum+=coin[i]*distance[i];
        }

        System.out.println(sum);
    }
}