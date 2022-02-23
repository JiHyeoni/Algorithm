import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    static int n;
    static char rgbArr[][];
    static int check[][];
    static char rbArr[][];

    static int [] x={-1,0,1,0};
    static int [] y={0,-1,0,1};

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        rgbArr=new char[n][n];
        check=new int[n][n];
        rbArr=new char[n][n];

        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<n;j++){
                char color=str.charAt(j);
                rgbArr[i][j]=color;
                if(color=='G')
                    rbArr[i][j]='R';
                else
                    rbArr[i][j]=color;
            }
        }

        int rgbCount=0;
        int rbCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[i][j]==0){
                    dfs(i,j,rgbArr,rgbArr[i][j]);
                    rgbCount++;
                }
            }
        }

        initCheck();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[i][j]==0){
                    dfs(i,j,rbArr,rbArr[i][j]);
                    rbCount++;
                }
            }
        }
        System.out.print(rgbCount+" "+rbCount);

    }

    public static void initCheck(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                check[i][j]=0;
            }
        }
    }

    public static void dfs(int v1,int v2,char [][]arr,char color){
        check[v1][v2]=1;
        for(int i=0;i<4;i++){
            int nx=v1+x[i];
            int ny=v2+y[i];
            if(nx>=0&&ny>=0&&nx<n&&ny<n&&arr[nx][ny]==color&&check[nx][ny]==0){
                dfs(nx,ny,arr,arr[nx][ny]);
            }
        }
    }
}