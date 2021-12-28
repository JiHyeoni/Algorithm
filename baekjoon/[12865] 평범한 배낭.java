import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int [] w=new int[n];
        int [] v=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            w[i]=Integer.parseInt(st.nextToken());
            v[i]=Integer.parseInt(st.nextToken());
        }
        int [] bag=new int[k+1];
        for(int i=0;i<n;i++){
            for(int j=k;j>=w[i];j--){
                bag[j]=Math.max(bag[j],bag[j-w[i]]+v[i]);
            }
        }

        System.out.print(bag[k]);
    }
}