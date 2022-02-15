import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int k;
    static int n;
    static int [] m;
    static int max;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        k=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        max=Integer.MIN_VALUE;
        m=new int[k];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            int num=Integer.parseInt(st.nextToken());
            m[i]=num;
            max=Math.max(max,num);
        }
        System.out.println(len());
    }

    public static long count (int number){
        long cnt=0;
        for (int i : m) {
            if(i>number) cnt+=(i-number);
        }
        return cnt;
    }
    public static int len(){
        int left=1;
        int right=max;
        while(left<right){
            int mid=(left+right)/2;
            if(count(mid)<n) right=mid;
            else left=mid+1;
        }
        return right-1;
    }
}