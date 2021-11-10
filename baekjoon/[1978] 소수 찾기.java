import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int [1001];
        int cnt=0;
        arr[1]=1;
        for(int i=2;i<=1000;i++){
            if(arr[i]==0){
                int j=2;
                while(i*j<=1000){
                    arr[i*j]=1;
                    j++;
                }
            }
        }

        for(int i=0;i<n;i++){
            int k=s.nextInt();
            if(arr[k]==0) cnt++;
        }

        System.out.println(cnt);
    }
}