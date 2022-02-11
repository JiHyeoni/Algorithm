import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato{
    int v1;
    int v2;
    int count;
    public Tomato(int v1,int v2, int count){
        this.v1=v1;
        this.v2=v2;
        this.count=count;
    }
}

class Main{
    static int n;
    static int m;
    static int [][] arr;
    static int [][] check;
    static int [] x={-1,0,1,0};
    static int [] y={0,-1,0,1};
    static int day=0;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[m][n];
        check=new int [m][n];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        Queue<Tomato> queue=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) queue.add(new Tomato(i,j,0));
            }
        }

        while (!queue.isEmpty()){
            Tomato now=queue.poll();
            check[now.v1][now.v2]=1;
            for (int i=0;i<4;i++){
                if(now.v1+x[i]>=0&&now.v2+y[i]>=0&&now.v1+x[i]<m&&now.v2+y[i]<n&&arr[now.v1+x[i]][now.v2+y[i]]==0&&check[now.v1+x[i]][now.v2+y[i]]==0){
                    arr[now.v1+x[i]][now.v2+y[i]]=1;
                    queue.add(new Tomato(now.v1+x[i],now.v2+y[i],now.count+1));
                    day=Math.max(day,now.count+1);
                }
            }
        }

        boolean ch=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) ch=false;
            }
        }

        System.out.println(ch?day:-1);



    }
}