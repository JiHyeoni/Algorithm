import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(constructor(n));
    }

    public static int constructor(int n){
        for(int i=1;i<=n;i++){
            int num=i;
            int sum=i;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum==n) return i;
        }
        return 0;
    }
}