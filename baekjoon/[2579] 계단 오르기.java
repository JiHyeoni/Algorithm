import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    static int n;
    static int [] stair;
    static Integer [] sum;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        stair=new int [n+1];
        sum=new Integer[n+1];

        for(int i=1;i<=n;i++){
            stair[i]=Integer.parseInt(br.readLine());
        }

        up(n);
        System.out.println(sum[n]);
    }

    public static int up(int k){
        if(k==0) return sum[k]=0;
        if (k==1) return sum[k]=stair[k];
        if (k==2) return sum[k]=stair[k-1]+stair[k];
        if(sum[k]==null){
            sum[k]=Math.max(up(k-2),up(k-3)+stair[k-1])+stair[k];
        }
        return sum[k];
    }
}