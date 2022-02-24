//BFS

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Main{
    static int w;
    static int h;
    static int map[][];
    static int check[][];
    static int x[]={-1,0,1,0,-1,-1,1,1};
    static int y[]={0,-1,0,1,-1,1,-1,1};
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        while(true){
            st=new StringTokenizer(br.readLine()," ");
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());

            if(w==0&&h==0) break;

            map=new int[h][w];
            check=new int[h][w];
            for(int i=0;i<h;i++){
                st=new StringTokenizer(br.readLine()," ");
                for(int j=0;j<w;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            int count=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]==1&&check[i][j]==0) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");

        }

        System.out.println(sb);
    }

    public static void bfs(int v1,int v2) {
        Queue<Point> queue=new LinkedList<>();
        check[v1][v2]=1;
        queue.add(new Point(v1,v2));

        while(!queue.isEmpty()){
            Point now=queue.poll();
            for(int i=0;i<8;i++){
                int nx=now.x+x[i];
                int ny=now.y+y[i];
                if(nx>=0&&ny>=0&&nx<h&&ny<w&&map[nx][ny]==1&&check[nx][ny]==0){
                    check[nx][ny]=1;
                    queue.add(new Point(nx,ny));
                }
            }
        }
    }
}



//DFS
/*

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

*/