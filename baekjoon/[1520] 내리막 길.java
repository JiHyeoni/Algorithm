import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int m;
    static int n;
    static int [][] map;
    static Integer [][] check;
    static int [] x={-1,0,1,0};
    static int [] y={0,-1,0,1};

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        map=new int[m][n];
        check=new Integer[m][n];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
               map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(dfs(0,0));

    }

    public static int dfs(int v1,int v2){
        if(v1==m-1&&v2==n-1) return check[v1][v2]=1;
        if(check[v1][v2]!=null) return check[v1][v2];

        check[v1][v2]=0;
        for(int i=0;i<4;i++){
            int nx=v1+x[i];
            int ny=v2+y[i];
            if(nx>=0&&ny>=0&&nx<m&&ny<n&&map[nx][ny]<map[v1][v2]){
                check[v1][v2]+=dfs(nx,ny);
            }
        }

        return check[v1][v2];
    }
}