import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        if(N!=1){
            int [] arr=new int [10000001];
            arr[0]=1;
            arr[1]=1;
            for(int i=2;i<=10000000;i++){
                if(arr[i]==0){
                    int j=2;
                    while(i*j<=10000000){
                        arr[i*j]=1;
                        j++;
                    }
                }
            }

            int i=2;
            while(N!=0&&i<=10000000){
                if(arr[i]==0) {
                    if (N % i == 0) {
                        System.out.println(i);
                        N /= i;
                    }
                    else i++;
                }
                else i++;
            }
        }
    }
}