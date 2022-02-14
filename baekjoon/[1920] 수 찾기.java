import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int [] A;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        A=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int m=Integer.parseInt(br.readLine());
        int [] B=new int[m];
        st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<m;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        StringBuilder sb=new StringBuilder();
        for(int integer:B){
            sb.append(check(integer)).append("\n");
        }
        System.out.println(sb);
    }

    public static int check(int number){
        int left=0;
        int right=A.length-1;
        boolean check_tf=false;
        while(left<=right){
            int mid=(left+right)/2;
            if(A[mid]==number){
                check_tf=true;
                break;
            }
            else if(A[mid]<number)
                left=mid+1;
            else right=mid-1;
        }
        return check_tf?1:0;
    }
}