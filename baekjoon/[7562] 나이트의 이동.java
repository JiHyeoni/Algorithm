import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

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
    static int [] x={-2,-1,1,2,-2,-1,1,2};
    static int [] y={-1,-2,-2,-1,1,2,2,1};
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            int [][] check=new int[n][n];
            st=new StringTokenizer(br.readLine()," ");
            Point start=new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);
            st=new StringTokenizer(br.readLine()," ");
            Point end=new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);
            sb.append(bfs(check,start,end)).append("\n");
        }
        System.out.println(sb);
    }
    public static int bfs(int [][] check, Point start, Point end){
        int count=0;
        Queue<Point> queue=new LinkedList<>();
        queue.add(start);
        check[start.x][start.y]=1;
        while(!queue.isEmpty()){
            Point now=queue.poll();
            if(now.x==end.x&&now.y==end.y) {
                count=now.count;
                break;
            }
            for(int i=0;i<8;i++){
                if(now.x+x[i]>=0&&now.y+y[i]>=0&&now.x+x[i]<check.length&&now.y+y[i]<check.length&&check[now.x+x[i]][now.y+y[i]]==0){
                    check[now.x+x[i]][now.y+y[i]]=1;
                    queue.add(new Point(now.x+x[i],now.y+y[i],now.count+1));
                }
            }
        }
        return count;
    }
}