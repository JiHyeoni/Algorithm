import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    static int k;
    static int n;
    static int [] cm;
    static int max;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        k=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        max=Integer.MIN_VALUE;
        cm=new int[k];
        for(int i=0;i<k;i++){
            int num=Integer.parseInt(br.readLine());
            cm[i]=num;
            max=Math.max(max,num);
        }
        System.out.println(len());
    }

    public static int count (int number){
        int cnt=0;
        for (int i : cm) {
            cnt+=i/number;
        }
        return cnt;
    }
    public static int len(){
        int left=0;
        int right=max+1;
        while(left<right){
            int mid=(left+right)/2;
            if(count(mid)<n) right=mid;
            else left=mid+1;
        }
        return right-1;
    }
}