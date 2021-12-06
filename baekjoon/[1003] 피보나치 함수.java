import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    static int [] zero;
    static int [] one;
    static StringBuilder sb=new StringBuilder();
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        zero=new int[41];
        zero[0]=1;
        one=new int[41];
        one[1]=1;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            fibonacci(N);
        }
        System.out.print(sb);
    }

    public static void fibonacci(int N){
        for(int i=2;i<=N;i++){
            if(zero[i]==0&&one[i]==0){
                zero[i]=zero[i-1]+zero[i-2];
                one[i]=one[i-1]+one[i-2];
            }
        }
        sb.append(zero[N]+" "+one[N]).append("\n");
    }
}