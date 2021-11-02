import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int cnt=1;
        int sum=1;
        
        while(true){
            if(num<=sum) break;
            sum=sum+cnt*6;
            cnt++;
        }
        System.out.print(cnt);
        
    }
}