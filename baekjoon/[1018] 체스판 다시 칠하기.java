import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

class Main{

    static boolean arr[][];
    static int N;
    static int M;
    static int min=Integer.MAX_VALUE;

    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr=new boolean[N][M];

        for(int i=0;i<N;i++){
            String str=br.readLine();
            for(int j=0;j<M;j++){
                if(str.charAt(j)=='W'){
                    arr[i][j]=true;
                }
                else arr[i][j]=false;
            }
        }

        for(int i=0;i<=N-8;i++){
            for(int j=0;j<=M-8;j++){
                chess(i,j);
            }
        }
        System.out.println(min);
    }

    public static void chess(int x,int y){
        int count=0;
        boolean wb=arr[x][y];

        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(arr[i][j]!=wb) count++;
                wb=(!wb);
            }
            wb=(!wb);
        }

        count=Math.min(count,64-count);
        min=Math.min(count,min);
    }
}