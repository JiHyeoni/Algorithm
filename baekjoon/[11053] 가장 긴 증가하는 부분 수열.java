import java.util.*;

class Main{
    static int [] arr;
    static int [] dp;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        arr=new int[n+1];
        dp=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=s.nextInt();

        for(int i=1;i<=n;i++){
            sequence(i);
        }

        int max=Integer.MIN_VALUE;
        for (int i=1;i<=n;i++) {
            max=Math.max(max,dp[i]);
            //System.out.print(dp[i]+" ");
        }
        //System.out.println();
        System.out.println(max);


    }

    public static int sequence(int n){
        if(dp[n]==0){
            dp[n]=1;
            for(int i=1;i<=n;i++){
                if(arr[n]>arr[i]){
                    dp[n]=Math.max(dp[n],sequence(i)+1);
                }
            }
        }
        return dp[n];
    }
}