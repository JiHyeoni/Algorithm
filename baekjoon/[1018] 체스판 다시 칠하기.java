import java.util.*;
class Main{
    public static boolean arr[][];
    public static int min=Integer.MAX_VALUE;

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();

        arr=new boolean[n][m];

        for(int i=0;i<n;i++){
            String str=s.next();
            for(int j=0;j<m;j++){
                if(str.charAt(j)=='W') arr[i][j]=true;
                else arr[i][j]=false;
            }
        }

        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x,int y){
        int count=0;
        boolean WB=arr[x][y];

        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                if(arr[i][j]!=WB){
                    count++;
                }
                WB=(!WB);
            }
            WB=(!WB);
        }
        count=Math.min(count,64-count);
        min=Math.min(min,count);
    }
}