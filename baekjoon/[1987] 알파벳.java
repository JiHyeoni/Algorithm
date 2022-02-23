import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int x [] ={-1,0,1,0};
    static int y [] ={0,-1,0,1};
    static char arr[][];
    static int check[];
    static int r;
    static int c;
    static int maxCount=Integer.MIN_VALUE;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        r=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        arr=new char[r][c];
        check =new int [26];
        for(int i=0;i<r;i++){
            String str=br.readLine();
            for(int j=0;j<c;j++){
                arr[i][j]=str.charAt(j);
            }
        }
        check[arr[0][0]-65]=1;
        dfs(0,0,1);
        System.out.print(maxCount);
    }

    public static void dfs(int v1,int v2,int count){

        for(int i=0;i<4;i++){
            int nx=v1+x[i];
            int ny=v2+y[i];
            if(nx>=0&&ny>=0&&nx<r&&ny<c&&check[arr[nx][ny]-65]==0){
                check[arr[nx][ny]-65]=1;
                dfs(nx,ny,count+1);
                check[arr[nx][ny]-65]=0;
            }
        }
        maxCount=Math.max(count,maxCount);

    }
}