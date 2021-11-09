import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int [][] arr=new int[15][15];

        for(int i=0;i<15;i++) arr[0][i]=i;

        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }

        for(int i=0;i<t;i++){
            int k=s.nextInt();
            int n=s.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}