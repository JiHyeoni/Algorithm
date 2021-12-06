import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    static long p[];
    static StringBuilder sb=new StringBuilder();
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        p=new long[101];
        p[1]=1L;
        p[2]=1L;
        p[3]=1L;
        p[4]=2L;
        p[5]=2L;
        p[6]=3L;
        p[7]=4L;
        p[8]=5L;
        p[9]=7L;
        p[10]=9L;
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            triangle(N);
        }
        System.out.println(sb);
    }

    public static void triangle(int N){
        if(p[N]!=0)
        {
            sb.append(p[N]).append("\n");
            return;
        }
        else{
            for(int i=11;i<=N;i++){
                if(p[i]==0){
                    p[i]=p[i-5]+p[i-1];
                }
            }
            sb.append(p[N]).append("\n");
        }

    }
}