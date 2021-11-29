import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int N;
    static int M;
    static int [] ch;
    static int [] arr;

    public static void DFS(int L,int k){
        if(L==M){
            for(int i=0;i<M;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        else{
            for(int i=k;i<=N;i++){
                if(ch[i]==0){
                    ch[i]=1;
                    arr[L]=i;
                    DFS(L+1,i+1);
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
        ch= new int [N+1];
        arr=new int [M];
        DFS(0,1);
    }
}
