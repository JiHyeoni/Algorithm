import java.util.*;

class Main{
    static int arr[];
    static Integer dp1[];
    static Integer dp2[];
    static int n;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        arr=new int[n+1];
        dp1=new Integer[n+1];
        dp2=new Integer[n+1];

        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=1;i<=n;i++){
            sequence1(i);
        }
        for(int i=n;i>0;i--){
            sequence2(i);
        }

        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            max=Math.max(max,dp1[i]+dp2[i]-1);
        }
        System.out.println(max);


    }
    public static int sequence1(int s){
        if(dp1[s]==null){
            dp1[s]=1;
            for(int i=1;i<=s;i++){
                if(arr[i]<arr[s]){
                    dp1[s]=Math.max(dp1[s],sequence1(i)+1);
                }
            }
        }
        return dp1[s];
    }

    public static int sequence2(int s){
        if(dp2[s]==null){
            dp2[s]=1;
            for(int i=n;i>s;i--){
                if(arr[s]>arr[i]) {
                    dp2[s]=Math.max(dp2[s],sequence2(i)+1);
                }
            }

        }
        return dp2[s];
    }
}