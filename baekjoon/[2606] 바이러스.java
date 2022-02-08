import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int count;
    static int [][] arr;
    static boolean [] check;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        arr=new int[n+1][n+1];
        check=new boolean[n+1];
        for(int i=0;i<m;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            arr[s][e]=1;
            arr[e][s]=1;
        }
        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int v){
        check[v]=true;
        for(int i=1;i<arr.length;i++){
            if(i!=v&&arr[v][i]==1&&check[i]==false){
                count++;
                dfs(i);
            }
        }
    }
}