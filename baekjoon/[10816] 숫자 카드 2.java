import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int [] A;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        A=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int m=Integer.parseInt(br.readLine());
        int [] B=new int [m];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        StringBuilder sb=new StringBuilder();
        for(int num:B){
            sb.append(up(num)-down(num)).append(" ");
        }
        System.out.println(sb);
    }

    public static int up(int num){
        int left=0;
        int right=A.length;
        while(left<right){
            int mid=(left+right)/2;
            if(A[mid]<=num) left=mid+1;
            else right=mid;
        }
        return left;
    }

    public static int down(int num){

        int left=0;
        int right=A.length;
        while(left<right){
            int mid=(left+right)/2;
            if(A[mid]>=num) right=mid;
            else left=mid+1;
        }
        return right;
    }


}