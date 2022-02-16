import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int n;
    static int max=Integer.MIN_VALUE;
    static int [] len;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int k=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        len=new int[k];
        for(int i=0;i<k;i++){
            int num=Integer.parseInt(br.readLine());
            len[i]=num;
            max=Math.max(max,num);
        }

        System.out.print(cm());
    }

    public static int cnt(int mid){
        int count=0;
        for (int num : len) {
            count+=num/mid;
        }
        return count;
    }

    public static int cm(){
        int left=0;
        int right=max+1;
        while(left<right){
            int mid=(left+right)/2;
            if(cnt(mid)<n) right=mid;
            else left=mid+1;
        }
        return right-1;
    }

}