import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    static int [] a;
    static int [] x;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m=Integer.parseInt(br.readLine());
        x=new int [m];
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<m;i++){
            x[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb=new StringBuilder();
        for (int k : x) {
            sb.append(upper(k)-lower(k)).append(" ");
        }
        System.out.println(sb);
    }

    public static int upper(int k){
        int left=0;
        int right=a.length;
        while(left<right){
            int mid=(left+right)/2;
            if(a[mid]<=k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
    public static int lower(int k){
        int left=0;
        int right=a.length;
        while(left<right){
            int mid=(left+right)/2;
            if(a[mid]>=k){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
}

