import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int [][] arr;
    static int [] check;
    static ArrayList<Integer> result=new ArrayList<>();
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        int n=Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        arr=new int[n+1][n+1];
        check=new int[n+1];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            arr[s][e]=1;
            arr[e][s]=1;
        }
        StringBuilder sb=new StringBuilder();
        dfs(v);
        for (Integer integer : result) {
            sb.append(integer).append(" ");
        }
        sb.append("\n");
        bfs(v);
        for (Integer integer : result) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb);

    }

    public static void init(){
        result.clear();
        for(int i=0;i<check.length;i++){
            check[i]=0;
        }
    }
    public static void dfs(int v){
        check[v]=1;
        result.add(v);
        for(int i=1;i<check.length;i++){
            if(v!=i&&arr[v][i]==1&&check[i]==0){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        init();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        check[v]=1;
        result.add(v);
        while(!queue.isEmpty()){
            int now=queue.poll();
            for(int i=1;i<check.length;i++){
                if(now!=i&&arr[now][i]==1&&check[i]==0){
                    queue.add(i);
                    check[i]=1;
                    result.add(i);
                }
            }
        }
    }
}