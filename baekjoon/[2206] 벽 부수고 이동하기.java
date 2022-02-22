import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Point{
    int x;
    int y;
    int distance;
    int drill;
    Point(int x,int y,int distance,int drill){
        this.x=x;
        this.y=y;
        this.distance=distance;
        this.drill=drill;
    }
}

class Main{
    static int n;
    static int m;
    static int map[][];
    static int check[][];
    static int x[]={0,0,-1,1};
    static int y[]={1,-1,0,0};
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        map=new int[n][m];
        check=new int[n][m];
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<m;j++){
                map[i][j]=str.charAt(j)-'0';
                check[i][j]=Integer.MAX_VALUE;
            }
        }
        System.out.println(bfs(0,0));
    }

    public static int bfs(int v1,int v2){
        Queue<Point> queue=new LinkedList<>();
        queue.add(new Point(v1,v2,1,0));
        check[v1][v2]=0;

        while(!queue.isEmpty()){
            Point now=queue.poll();
            if(now.x==n-1&&now.y==m-1) return now.distance;
            for(int i=0;i<4;i++){
                int nx=x[i]+now.x;
                int ny=y[i]+now.y;
                if(nx>=0&&ny>=0&&nx<n&&ny<m){
                    if(check[nx][ny]>now.drill){
                        if(map[nx][ny]==0){
                            queue.add(new Point(nx,ny,now.distance+1,now.drill));
                            check[nx][ny]=now.drill;
                        }
                        else{
                            if(now.drill==0){
                                queue.add(new Point(nx,ny,now.distance+1,1));
                                check[nx][ny]=now.drill;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}