import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long [] distance=new long[n-1];
        long [] price=new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n-1;i++){
            distance[i]=Long.parseLong(st.nextToken());
        }
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            price[i]=Long.parseLong(st.nextToken());
        }
        long money=distance[0]*price[0];
        for(int i=1;i<n-1;i++){
            if(price[i-1]<price[i]){
                price[i]=price[i-1];
            }
            money+=price[i]*distance[i];
        }

        System.out.println(money);



    }
}