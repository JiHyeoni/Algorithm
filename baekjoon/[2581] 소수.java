import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int [] arr=new int[10001];
        arr[1]=1;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=2;i<=10000;i++){
            if(arr[i]==0){
                int j=2;
                while(i*j<=10000){
                    arr[i*j]=1;
                    j++;
                }
            }
        }

        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(arr[i]==0){
                sum+=i;
                if(min==Integer.MAX_VALUE) min=i;
            }
        }

        if(sum==0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}