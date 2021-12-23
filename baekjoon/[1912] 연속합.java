import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int n;
    static int arr[];
    static Integer dp[];
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        dp=new Integer[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        sum(n-1);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }

    public static int sum(int k){
        if(k==0){
            return dp[0]=arr[0];
        }
        else {
            if (dp[k] == null) {
                dp[k] = Math.max(arr[k], sum(k - 1) + arr[k]);
            }
            return dp[k];
        }
    }
}