import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int [] arr = new int[(123456*2)+1];
        arr[1]=1;
        for(int i=2;i<=(123456*2);i++){
            if(arr[i]==0){
                int j=2;
                while(i*j<=123456*2){
                    arr[i*j]=1;
                    j++;
                }
            }
        }

        while(true){
            int n=s.nextInt();
            if(n==0) break;
            int cnt=0;
            for(int i=n+1;i<=2*n;i++){
                if(arr[i]==0) cnt++;
            }
            System.out.println(cnt);
        }

    }
}