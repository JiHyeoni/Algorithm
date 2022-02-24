import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int n;
    static int family[][];
    static int check[];
    static int x;
    static int y;
    static int cnt=-1;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        family=new int [n][n];
        check=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        x=Integer.parseInt(st.nextToken());
        y=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            family[a-1][b-1]=1;
            family[b-1][a-1]=1;
        }
        check[x-1]=1;
        dfs(x-1,0);
        System.out.println(cnt);
    }

    public static void dfs(int v,int count){
        if(v==y-1) {
            cnt=count;
            return;
        }
        for(int i=0;i<n;i++){
            if(family[v][i]==1&&check[i]==0){
                check[i]=1;
                dfs(i,count+1);
                check[i]=0;
            }
        }
        return;
    }
}