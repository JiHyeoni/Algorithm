import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long sum=0;
        long [][] arr=new long[N+1][10];

        for(int i=1;i<10;i++){
            arr[1][i]=1l;
        }

        for(int i=2;i<=N;i++){
            for(int j=0;j<10;j++){
                if(j==0) arr[i][j]=arr[i-1][j+1]%1000000000;
                else if(j==9) arr[i][j]=arr[i-1][j-1]%1000000000;
                else arr[i][j]=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
            }
        }

        for(int i=0;i<10;i++){
            sum+=arr[N][i];
        }

        System.out.println(sum%1000000000);
    }
}