import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


class Main {
    static int n;
    static int [][] arr;
    static int minus;
    static int zero;
    static int one;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        paper(0,0,n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }

    public static void paper(int row,int col,int size){
        if(check(row,col,size)) {
            if(arr[row][col]==-1) minus++;
            else if(arr[row][col]==0) zero++;
            else one++;
            return;
        }
        size=size/3;
        paper(row,col,size);
        paper(row+size,col,size);
        paper(row+size*2,col,size);
        paper(row,col+size,size);
        paper(row+size,col+size,size);
        paper(row+2*size,col+size,size);
        paper(row,col+2*size,size);
        paper(row+size,col+2*size,size);
        paper(row+2*size,col+2*size,size);
    }

    public static boolean check(int row,int col,int size){
        int first=arr[row][col];
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(first!=arr[i][j]) return false;
            }
        }

        return true;
    }
}
