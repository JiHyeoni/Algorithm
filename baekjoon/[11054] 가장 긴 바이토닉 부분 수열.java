import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        int max=0;

        int ch1[]=new int[n+1];
        int ch2[]=new int[n+1];
        ch1[1]=1;
        ch2[n]=1;
        for(int i=2;i<=n;i++){
            int val=0;
            for(int j=1;j<i;j++){
                if(arr[j]<arr[i]){
                    if(val<ch1[j]) val=ch1[j];
                }
            }
            ch1[i]=val+1;
        }

        for(int i=n-1;i>=1;i--){
            int val=0;
            for(int j=n;j>i;j--){
                if(arr[j]<arr[i]){
                    if(val<ch2[j]) val=ch2[j];
                }
            }
            ch2[i]=val+1;
        }


        for(int i=1;i<=n;i++){
            max=Math.max(max,ch1[i]+ch2[i]-1);
        }
        System.out.println(max);

    }
}