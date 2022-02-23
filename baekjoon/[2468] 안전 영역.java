import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int arr[][];
    static int check[][];
    static int x[]={-1,0,1,0};
    static int y[]={0,-1,0,1};
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;
    static int h;
    static int n;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr=new int [n][n];
        check=new int[n][n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                int num=Integer.parseInt(st.nextToken());
                arr[i][j]=num;
                min=Math.min(num,min);
                max=Math.max(num,max);
            }
        }

        int maxCount=Integer.MIN_VALUE;
        for(int k=min;k<=max;k++){
            initCheck();
            int count=0;
            h=k;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]>=h&&check[i][j]==0){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            maxCount=Math.max(maxCount,count);
        }

        System.out.println(maxCount);
    }

    public static void initCheck(){
        for(int i=0;i<check.length;i++){
            for(int j=0;j<check.length;j++){
                check[i][j]=0;
            }
        }
    }

    public static void dfs(int v1,int v2){
        check[v1][v2]=1;
        for(int i=0;i<4;i++){
            int nx=v1+x[i];
            int ny=v2+y[i];
            if(nx>=0&&ny>=0&&nx<n&&ny<n&&arr[nx][ny]>=h&&check[nx][ny]==0){
                dfs(nx,ny);
            }
        }
    }
}