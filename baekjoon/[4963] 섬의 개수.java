import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int [][] arr;
    static int [][] check;
    static int w;
    static int h;
    static int [] x={-1,0,1,0,1,1,-1,-1};
    static int [] y={0,-1,0,1,-1,1,-1,1};
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        while(true){
            st=new StringTokenizer(br.readLine()," ");
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());

            if(w==0&&h==0) break;

            arr=new int[h][w];
            check=new int[h][w];

            for(int i=0;i<h;i++){
                st=new StringTokenizer(br.readLine()," ");
                for(int j=0;j<w;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            int count=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(arr[i][j]==1&&check[i][j]==0){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int v1,int v2){
        check[v1][v2]=1;
        for(int i=0;i<8;i++){
            int nx=v1+x[i];
            int ny=v2+y[i];
            if(nx>=0&&nx<h&&ny>=0&&ny<w&&arr[nx][ny]==1&&check[nx][ny]==0){
                dfs(nx,ny);
            }
        }
    }
}