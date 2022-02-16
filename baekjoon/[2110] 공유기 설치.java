import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Main{
    static int [] x;
    static int c;
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        x=new int [n];
        for(int i=0;i<n;i++){
            x[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(x);

        System.out.println(len());
    }

    public static int count(int mid){
        int cnt=1;
        int point=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]-point>=mid){
                point=x[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static int len(){
        int left=0;
        int right=x[x.length-1]+1;
        while(left<right){
            int mid=(left+right)/2;

            if(count(mid)<c) right=mid;
            else left=mid+1;
        }
        return right-1;
    }
}