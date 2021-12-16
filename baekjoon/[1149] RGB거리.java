import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int [][] cost;
    static int [][] dp;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        cost=new int[N][3];
        dp=new int[N][3];
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            cost[i][0]=Integer.parseInt(st.nextToken());
            cost[i][1]=Integer.parseInt(st.nextToken());
            cost[i][2]=Integer.parseInt(st.nextToken());
        }
        dp[0][0]=cost[0][0];
        dp[0][1]=cost[0][1];
        dp[0][2]=cost[0][2];

        System.out.println(Math.min(Paint(N-1,0),Math.min(Paint(N-1,1),Paint(N-1,2))));
    }

    public static int Paint(int L,int color){
        if(dp[L][color]==0){
            if(color==0) dp[L][color]=Math.min(Paint(L-1,1),Paint(L-1,2))+cost[L][color];
            else if(color==1) dp[L][color]=Math.min(Paint(L-1,0),Paint(L-1,2))+cost[L][color];
            else if(color==2) dp[L][color]=Math.min(Paint(L-1,0),Paint(L-1,1))+cost[L][color];
        }
        return dp[L][color];
    }
}