import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m=Integer.parseInt(br.readLine());
        int [] x=new int [m];
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<m;i++){
            x[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb=new StringBuilder();
        for (int k : x) {
            int left=0;
            int right=n-1;
            while (true) {
                int mid=(left+right)/2;
                if(left>right){
                    sb.append(0).append("\n");
                    break;
                }
                if(a[mid]==k){
                    sb.append(1).append("\n");
                    break;
                }
                else if(a[mid]>k) {
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }

            }
        }
        System.out.println(sb);

    }
}

