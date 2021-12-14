import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int arr[][][];
    static StringBuilder sb;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        int b=0;
        int c=0;
        StringTokenizer st;
        sb=new StringBuilder();
        arr=new int[101][101][101];
        while(true){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());
            if(a==-1&&b==-1&&c==-1) break;
            sb.append("w("+a+", "+b+", "+c+") = "+ w(a,b,c)).append("\n");
        }
        System.out.println(sb);
    }

    public static int w(int a,int b,int c){
        if(arr[a+50][b+50][c+50]!=0){
            return arr[a+50][b+50][c+50];
        }
        else{
            if (a<=0||b<=0||c<=0) {
                return arr[a+50][b+50][c+50] = 1;
            }

            else if(a > 20 || b > 20 || c > 20){
                return arr[a+50][b+50][c+50]=w(20,20,20);
            }
            else if(a<b &&b < c){
                return   arr[a+50][b+50][c+50]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            }
            else {
                return arr[a+50][b+50][c+50]=w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
            }
        }
    }
}