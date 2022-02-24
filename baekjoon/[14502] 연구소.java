import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class Virus{
    int x;
    int y;
    Virus(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Main{
    static int n;
    static int m;
    static int map[][];
    static int copyMap[][];
    static int [] x={-1,0,1,0};
    static int [] y={0,-1,0,1};
    static int maxCount=Integer.MIN_VALUE;

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        map=new int[n][m];
        copyMap=new int[n][m];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(maxCount);
    }
    public static void dfs(int depth){
        if(depth==3){
            bfs();
            return;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0){
                    map[i][j]=1;
                    dfs(depth+1);
                    map[i][j]=0;
                }
            }
        }

    }

    public static void copy(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copyMap[i][j]=map[i][j];
            }
        }
    }
    public static void bfs(){
        copy();
        Queue<Virus> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(copyMap[i][j]==2) queue.add(new Virus(i,j));
            }
        }

        while(!queue.isEmpty()){
            Virus now=queue.poll();
            for(int i=0;i<4;i++){
                int nx=now.x+x[i];
                int ny=now.y+y[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&copyMap[nx][ny]==0){
                    copyMap[nx][ny]=2;
                    queue.add(new Virus(nx,ny));
                }
            }
        }

        maxCount=Math.max(maxCount,safeArea());
    }

    public static int safeArea(){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(copyMap[i][j]==0) count++;
            }
        }

        return count;
    }

}