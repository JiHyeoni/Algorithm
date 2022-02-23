import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int m;
    static int n;
    static int k;
    static int arr[][];
    static int check[][];
    static int x[]={-1,0,1,0};
    static int y[]={0,-1,0,1};
    static int maxCount;
    static int cnt;
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        arr=new int[m][n];
        check=new int[m][n];
        for(int l=0;l<k;l++){
            st=new StringTokenizer(br.readLine()," ");
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());

            for(int i=y1;i<y2;i++) {
                for(int j=x1;j<x2;j++){
                    arr[i][j]=1;
                }
            }
        }

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0&&check[i][j]==0){
                    maxCount=Integer.MIN_VALUE;
                    cnt=1;
                    count++;
                    dfs(i,j);
                    list.add(maxCount);
                }
            }
        }

        Collections.sort(list);
        StringBuilder sb=new StringBuilder();

        sb.append(count).append("\n");
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }

    public static void dfs(int v1,int v2){
        check[v1][v2]=1;
        for(int i=0;i<4;i++){
            int nx=x[i]+v1;
            int ny=y[i]+v2;
            if(nx>=0&&nx<m&&ny>=0&&ny<n&&arr[nx][ny]==0&&check[nx][ny]==0){
                dfs(nx,ny);
                cnt++;
            }
        }
        maxCount=Math.max(maxCount,cnt);
    }
}