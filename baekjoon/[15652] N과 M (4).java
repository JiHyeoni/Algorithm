import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int N;
    static int M;
    static int arr[];
    static StringBuilder sb;

    public static void DFS(int k,int L){

        if(L==M){
            for(int i=0;i<M;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        else{
            for(int i=k;i<=N;i++){
                arr[L]=i;
                DFS(i,L+1);
            }
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        arr=new int[M];
        sb=new StringBuilder();
        DFS(1,0);
        System.out.println(sb);

    }

}