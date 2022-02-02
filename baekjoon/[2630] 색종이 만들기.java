import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    static int [][] arr;
    static int blue;
    static int white;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr=new int[n][n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        paper(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void paper(int row,int col,int size){
        if(check(row,col,size)){
            if(arr[row][col]==0) white++;
            else blue++;
            return;
        }

        size=size/2;
        paper(row,col,size);
        paper(row,col+size,size);
        paper(row+size,col,size);
        paper(row+size,col+size,size);
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

