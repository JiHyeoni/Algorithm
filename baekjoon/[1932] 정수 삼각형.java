import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][] arr=new int [n][n];
        int [][] sum=new int [n][n];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=s.nextInt();
            }
        }

        sum[0][0]=arr[0][0];
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    sum[i][0]=sum[i-1][0]+arr[i][0];
                }
                else if(j==i){
                    sum[i][j]=sum[i-1][j-1]+arr[i][j];
                }
                else{
                    sum[i][j]=Math.max(sum[i][j],Math.max(sum[i-1][j-1],sum[i-1][j])+arr[i][j]);
                }
            }
        }
            for(int i=0;i<n;i++){
                max=Math.max(max,sum[n-1][i]);
            }
            System.out.println(max);
    }
}