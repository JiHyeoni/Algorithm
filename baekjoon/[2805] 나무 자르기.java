import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int m;
    static int [] tree;
    static int max;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        tree=new int [n];
        st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            tree[i]=num;
            max=Math.max(max,num);
        }
        System.out.println(height());
    }

    public static long len(int mid){
        long count=0;
        for(int num:tree){
            if(num>mid) count+=(num-mid);
        }
        return count;
    }

    public static int height(){
        int left=0;
        int right=max+1;
        while(left<right){
            int mid=(left+right)/2;
            if(len(mid)<m) right=mid;
            else left=mid+1;
        }
        return right-1;
    }
}