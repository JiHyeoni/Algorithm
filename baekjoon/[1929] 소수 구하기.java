import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int [] arr=new int[n+1];
        arr[1]=1;
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                int j=2;
                while(i*j<=n){
                    arr[i*j]=1;
                    j++;
                }
            }
        }
        for(int i=m;i<=n;i++){
            if(arr[i]==0) System.out.println(i);
        }

    }
}