import java.util.*;
class Main{
    static int arr[];
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        arr= new int [10001];
        arr[1]=1;
        for(int i=2;i<=10000;i++){
            if(arr[i]==0){
                int j=2;
                while(i*j<=10000){
                    arr[i*j]=1;
                    j++;
                }
            }
        }

        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int n=s.nextInt();
            sosu(n);
        }
    }

    public static void sosu(int n){
        int i=n/2;
        int j=n/2;

        while(true){
            if(i+j==n){
                if(arr[i]==0&&arr[j]==0){
                    break;
                }
            }
            i--;
            j++;
        }

        System.out.println(i+" "+j);
    }
}