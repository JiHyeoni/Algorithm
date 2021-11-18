import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=1;
        int num=666;
        while(count!=n){
            num++;
            if(String.valueOf(num).contains("666")) count++;
        }

        System.out.println(num);
    }
}