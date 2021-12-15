import java.util.*;

class Main{
    static long [] arr;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        arr=new long[101];
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            System.out.println(P(N));
        }
    }

    public static long P(int N){
        arr[1]=1l;
        arr[2]=1l;
        arr[3]=1l;
        for(int i=4;i<=N;i++){
            if(arr[i]==0) arr[i]=arr[i-2]+arr[i-3];
        }
        return arr[N];
    }
}