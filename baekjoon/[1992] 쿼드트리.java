import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


class Main {
    static int n;
    static int arr[][];
    static int black;
    static int white;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j]=str.charAt(j)-'0';
            }
        }
        //sb.append('(');
        color(0,0,n);
        //sb.append(')');
        System.out.println(sb);
    }
    public static void color(int row,int col,int size){
        if(check(row,col,size)){
            if(arr[row][col]==0) sb.append(0);
            else sb.append(1);
            return;
        }
        size=size/2;
        sb.append('(');
        color(row,col,size);
        color(row,col+size,size);
        color(row+size,col,size);
        color(row+size,col+size,size);
        sb.append(')');
    }

    public static boolean check(int row, int col, int size){
        int first=arr[row][col];
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(first!=arr[i][j]) return false;
            }
        }
        return true;
    }
}
