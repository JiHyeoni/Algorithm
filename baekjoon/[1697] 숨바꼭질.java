import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Point{
    int x;
    int count;
    public Point(int x,int count){
        this.x=x;
        this.count=count;
    }
}

class Main{
    static int n;
    static int k;
    static int [] arr;
    static int [] check;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        arr=new int[100001];
        check=new int [100001];
        System.out.println(bfs(n));
    }
    public static int bfs(int v){
        int day=0;
        Queue<Point> queue=new LinkedList<>();
        queue.add(new Point(v,0));
        check[v]=1;

        while(!queue.isEmpty()){
            Point now=queue.poll();
            if(now.x==k) {
                day=now.count;
                break;
            }
            if(now.x-1>=0&&now.x-1<check.length&&check[now.x-1]==0){
                check[now.x-1]=1;
                queue.add(new Point(now.x-1,now.count+1));
            }
            if(now.x+1>=0&&now.x+1<check.length&&check[now.x+1]==0){
                check[now.x+1]=1;
                queue.add(new Point(now.x+1,now.count+1));
            }
            if(now.x*2>=0&&now.x*2<check.length&&check[now.x*2]==0){
                check[now.x*2]=1;
                queue.add(new Point(now.x*2,now.count+1));
            }
        }
        return day;
    }
}