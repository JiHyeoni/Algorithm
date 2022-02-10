import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;
    int count;

    public Point(int x,int y,int count){
        this.x=x;
        this.y=y;
        this.count=count;
    }
}

class Main{
    static int [] v1={-1,0,1,0};
    static int [] v2={0,-1,0,1};
    static int n;
    static int m;
    static int [][] arr;
    static int [][] check;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        check=new int[n][m];
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=str.charAt(j)-'0';
            }
        }

        System.out.println(bfs(0,0));
    }

    public static int bfs(int x1, int y1){
        Queue<Point> queue=new LinkedList<>();
        queue.add(new Point(x1,y1,1));
        check[x1][y1]=1;
        int count=0;
        while(!queue.isEmpty()){
            Point now=queue.poll();
            if(now.x==n-1&&now.y==m-1) {
                count=now.count;
                break;
            }
            for(int i=0;i<4;i++){
                if(now.x+v1[i]>=0&&now.y+v2[i]>=0&&now.x+v1[i]<n&&now.y+v2[i]<m&&arr[now.x+v1[i]][now.y+v2[i]]==1&&check[now.x+v1[i]][now.y+v2[i]]==0){
                    check[now.x+v1[i]][now.y+v2[i]]=1;
                    queue.add(new Point(now.x+v1[i],now.y+v2[i],now.count+1));
                }
            }

        }
        return count;
    }
}
