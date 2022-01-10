import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    static int white=0;
    static int blue=0;
    static int [][] arr;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        quadTree(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void quadTree(int row, int col, int size){
        if(checkColor(row,col,size)){
            if(arr[row][col]==0) white++;
            else blue++;
            return;
        }
        size=size/2;
        quadTree(row,col,size);
        quadTree(row+size,col,size);
        quadTree(row,col+size,size);
        quadTree(row+size,col+size,size);
    }

    public static boolean checkColor(int row,int col,int size){
        int color=arr[row][col];
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(arr[i][j]!=color) return false;
            }
        }
        return true;
    }
}