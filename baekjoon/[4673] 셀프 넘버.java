import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean [] check=new boolean[100001];
        for(int i=1;i<=10000;i++)
            check[d(i)]=true;
        for(int i=1;i<=10000;i++)
            if(check[i]==false) System.out.println(i);
    }

    public static int d(int num){
        int sum=num;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
