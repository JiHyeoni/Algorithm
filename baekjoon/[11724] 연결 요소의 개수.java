//BFS
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int n;
    static int [][] arr;
    static int [] check;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        arr=new int[n][n];
        check=new int[n];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            arr[u-1][v-1]=1;
            arr[v-1][u-1]=1;
        }

        int count=0;

        for(int i=0;i<n;i++){
            if(check[i]==0){
                bfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    public static void bfs(int x){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(x);
        while(!queue.isEmpty()){
            Integer now=queue.poll();
            for(int i=0;i<n;i++){
                if(arr[now][i]==1&&check[i]==0){
                    check[i]=1;
                    queue.add(i);
                }
            }
        }

    }
}





//DFS
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int arr[][];
    static int check[];
    public static void main(String args []) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        long m=Integer.parseInt(st.nextToken());
        arr=new int[n][n];
        check=new int[n];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            arr[u-1][v-1]=1;
            arr[v-1][u-1]=1;
        }

        int count=0;

        for(int i=0;i<n;i++){
                if(check[i]==0){
                    dfs(i);
                    count++;
                }
        }

        System.out.println(count);
    }

    public static void dfs(int e){
        check[e]=1;
        for(int i=0;i<arr.length;i++){
            if(e!=i&&arr[e][i]==1&&check[i]==0)
                dfs(i);
        }
    }
}
*/
