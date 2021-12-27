import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int N;
    static int [] arr;
    static Integer [] dp;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        dp=new Integer[N];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        sum(N-1);
        int max=Integer.MIN_VALUE;
        for (Integer x : dp) {
            max=Math.max(max,x);
        }
        System.out.println(max);
    }

    public static int sum(int n){
        if(n==0) return dp[n]=arr[n];
        if(dp[n]==null){
            /*
            if(sum(n-1)<0) dp[n]=arr[n];
            else dp[n]=sum(n-1)+arr[n];
             */
            dp[n]=Math.max(sum(n-1)+arr[n],arr[n]);

        }
        return dp[n];
    }
}