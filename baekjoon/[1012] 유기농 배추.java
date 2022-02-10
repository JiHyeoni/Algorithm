import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int [] x1={-1,0,1,0};
    static int [] y1={0,-1,0,1};
    static int m;
    static int n;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<t;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            m=Integer.parseInt(st.nextToken());
            n= Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());

            int [][] arr=new int [m][n];
            boolean [][] check=new boolean[m][n];
            int count=0;
            for(int j=0;j<k;j++){
                st=new StringTokenizer(br.readLine()," ");
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                arr[x][y]=1;
            }

            for(int j=0;j<m;j++){
                for(int l=0;l<n;l++){
                    if(arr[j][l]==1&&check[j][l]==false){
                        count++;
                        dfs(j,l,arr,check);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int v1,int v2, int [][] arr, boolean [][] check){
        check[v1][v2]=true;
        for(int i=0;i<4;i++){
            if(v1+x1[i]>=0&&v2+y1[i]>=0&&v1+x1[i]<m&&v2+y1[i]<n&&arr[v1+x1[i]][v2+y1[i]]==1&&check[v1+x1[i]][v2+y1[i]]==false){
                dfs(v1+x1[i],v2+y1[i],arr,check);
            }
        }

    }
}
