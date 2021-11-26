import java.sql.SQLOutput;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int [] arr=new int [8001];
        int median=10000;
        int mode=10000;

        for(int i=0;i<N;i++){
            int x=Integer.parseInt(br.readLine());
            sum+=x;
            arr[x+4000]++;

            if(min>x) min=x;
            if(max<x) max=x;
        }

        int count=0;
        int mode_max=Integer.MIN_VALUE;
        boolean flag=false;

        for(int i=min+4000;i<=max+4000;i++){
            if(count<(N/2)+1){
                count+=arr[i];
                median=i-4000;
            }

            if(mode_max<arr[i]){
                mode_max=arr[i];
                mode=i-4000;
                flag=true;
            }
            else if(mode_max==arr[i]&&flag){
                flag=false;
                mode=i-4000;
            }
        }

        System.out.println(Math.round(sum/(float)N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max-min);
    }
}