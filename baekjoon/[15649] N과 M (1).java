import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int N;
    static int M;
    static int ch[];
    static int arr[];
    public static void DFS(int m){
        if(m==M){
            for(int i=0;i<M;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        else{
            for(int i=1;i<=N;i++){
                if(ch[i]==0){
                    ch[i]=1;
                    arr[m]=i;
                    DFS(m+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        ch=new int[N+1];
        arr=new int[M+1];

        DFS(0);
    }
}