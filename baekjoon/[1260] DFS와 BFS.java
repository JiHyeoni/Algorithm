import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{
    static int [][] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        arr=new int [n+1][n+1];
        check=new boolean[n+1];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            arr[start][end]=1;
            arr[end][start]=1;
        }
        dfs(v);
        sb.append("\n");
        bfs(v);
        System.out.println(sb);
    }

    public static void initCheck(){
        for(int i=0;i<check.length;i++){
            check[i]=false;
        }
    }

    public static void dfs(int v){
            sb.append(v).append(" ");
            check[v]=true;
            for(int i=1;i<arr.length;i++){
                if(i!=v&&arr[v][i]==1&&check[i]==false){
                    dfs(i);
                }
            }
    }

    public static void bfs(int v){
        initCheck();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        check[v]=true;
        while(!queue.isEmpty()){
            int k=queue.poll();
            sb.append(k).append(" ");
            for(int i=1;i<arr.length;i++){
                if(check[i]==false&&i!=k&&arr[k][i]==1){
                    queue.add(i);
                    check[i]=true;
                }
            }

        }

    }
}