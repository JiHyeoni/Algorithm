import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] arr=new int[n+1];
        int [] dp=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int val=0;
            for(int j=1;j<=i;j++){
                if(arr[j]<arr[i]){
                    if(val<dp[j]) val=dp[j];
                }
            }
            dp[i]=val+1;
        }

        int max=0;
        for(int x:dp) {
            //System.out.print(x+" ");
            max=Math.max(x,max);
        }
        System.out.println(max);

    }
}