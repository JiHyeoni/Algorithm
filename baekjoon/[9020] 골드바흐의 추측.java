import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int [] arr=new int [10001];
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

        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int j=n/2;
            int k=n/2;
            while(true){
                if(arr[j]==0&&arr[k]==0){
                    if(n==j+k){
                        System.out.println(j+" "+k);
                        break;
                    }
                }
                j--;
                k++;
            }
        }
    }
}

/*
import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int [] arr=new int [10001];
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

        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int min=Integer.MAX_VALUE;
            int a=0;
            int b=0;
            for(int j=2;j<=10000;j++){
                if(arr[j]==0){
                    for(int k=2;k<=10000;k++){
                        if(arr[k]==0){
                            if(j+k==n){
                                if(k-j>=0&&min>k-j){
                                    min=k-j;
                                    a=j;
                                    b=k;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
 */