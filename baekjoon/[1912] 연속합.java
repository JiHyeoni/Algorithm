import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        int [] sum=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            if(sum[i-1]>0){
                sum[i]=sum[i-1]+arr[i];
            }
            else {
                sum[i]=arr[i];
            }
        }

        int max=Integer.MIN_VALUE;
        for (int x : sum) {
            max=Math.max(x,max);
        }

        System.out.println(max);
    }
}