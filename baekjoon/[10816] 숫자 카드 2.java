import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    static int [] A;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int m=Integer.parseInt(br.readLine());
        int [] B=new int[m];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb=new StringBuilder();
        for(int x:B){
            sb.append(up(x)-down(x)).append(" ");
        }
        System.out.println(sb);
    }

    public static int up(int x){
        int left=0;
        int right=A.length;
        while(left<right){
            int mid=(left+right)/2;
            if(A[mid]>x) right=mid;
            else left=mid+1;
        }
        return left;
    }

    public static int down(int x){
        int left=0;
        int right=A.length;

        while(left<right){
            int mid=(left+right)/2;
            if(A[mid]>=x) right=mid;
            else left=mid+1;
        }
        return right;
    }
}