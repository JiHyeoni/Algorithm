import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    static int [] juice;
    static Integer [] drink;
    static int n;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        juice=new int[n+1];
        drink=new Integer[n+1];
        for(int i=1;i<n+1;i++){
            juice[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(grape(n));

    }
    public static int grape(int N){
        if (N==0) return drink[0]=0;
        if(N==1){
            return drink[1]=juice[1];
        }
        if(N==2){
            return drink[2]=juice[1]+juice[2];
        }
        if(drink[N]==null){
            drink[N]=Math.max(Math.max(grape(N-2),grape(N-3)+juice[N-1])+juice[N],grape(N-1));
        }
        return drink[N];
    }
}