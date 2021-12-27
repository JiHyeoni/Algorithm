import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int N;
    static long [][] stair;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        stair=new long[N][10];

        for(int i=0;i<10;i++){
            stair[0][i]=1l;
        }

        for(int i=1;i<N;i++){
            for(int j=0;j<10;j++){
                if(j==0) stair[i][j]=stair[i-1][j+1]%1000000000;
                else if(j==9) stair[i][j]=stair[i-1][j-1]%1000000000;
                else stair[i][j]=(stair[i-1][j-1]+stair[i-1][j+1])%1000000000;
            }
        }

        long sum=0;
        for(int i=1;i<10;i++){
            sum+=stair[N-1][i];
        }

        System.out.println(sum%1000000000);
    }
}