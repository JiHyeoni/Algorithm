import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=1;
        int num=666;

        while(cnt!=n){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);
    }
}