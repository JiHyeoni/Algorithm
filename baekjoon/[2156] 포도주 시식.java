import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    static int n;
    static int [] juice;
    static Integer [] sum;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        juice=new int[n+1];
        sum=new Integer[n+1];
        for(int i=1;i<=n;i++){
            juice[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(drink(n));
    }

    public static int drink(int k){
        if(k==0) return sum[k]=0;
        if(k==1) return sum[k]=juice[k];
        if(k==2) return sum[k]=juice[k-1]+juice[k];
        if(sum[k]==null){
            sum[k]=Math.max(Math.max(drink(k-2),drink(k-3)+juice[k-1])+juice[k],drink(k-1));
        }
        return sum[k];
    }
}