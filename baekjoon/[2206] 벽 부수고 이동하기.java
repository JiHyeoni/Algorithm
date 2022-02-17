import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.BufferedReader;
        import java.util.*;

class Point{
    int x;
    int y;
    int distance;
    int drill;
    public Point(int x,int y,int distance,int drill){
        this.x=x;
        this.y=y;
        this.distance=distance;
        this.drill=drill;
    }
}
class Main{
    static int n;
    static int m;
    static int arr[][];
    static int check[][];
    static int [] dx={0,-1,0,1};
    static int [] dy={-1,0,1,0};

    public static void main(String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        check=new int[n][m];

        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=str.charAt(j)-'0';
                check[i][j]=Integer.MAX_VALUE;
            }
        }

        System.out.println(bfs(0,0));

    }

    public static int bfs(int v1,int v2){
        Queue<Point> queue=new LinkedList<>();
        queue.add(new Point(v1,v2,1,0));
        check[v2][v1]=0;

        while(!queue.isEmpty()){
            Point point=queue.poll();

            if(point.x==m-1&&point.y==n-1) {
                return point.distance;
            }

            for(int i=0;i<4;i++){
                int nx=point.x+dx[i];
                int ny=point.y+dy[i];

                if(nx>=0&&ny>=0&&ny<n&&nx<m){
                    if(check[ny][nx]>point.drill){
                        if (arr[ny][nx] == 0) {
                            queue.add(new Point(nx, ny, point.distance + 1, point.drill));
                            check[ny][nx] = point.drill;
                        } else {
                            if (point.drill == 0) {
                                queue.add(new Point(nx, ny, point.distance + 1, point.drill + 1));
                                check[ny][nx] = point.drill + 1;
                            }
                        }
                    }
                }
            }

        }

        return -1;
    }
}