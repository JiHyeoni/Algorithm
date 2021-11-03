import java.util.*;

class Main{
    public static void main(String []args){

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(hansu(num));
    }

    public static int hansu(int num){
        int sum=0;

        if(num<100) sum=num;
        else {
            sum=99;
            if(num==1000) num=999;
            for(int i=100;i<=num;i++){
                int one=i%10;
                int ten=(i/10)%10;
                int hun=i/100;
                if((ten-one)==(hun-ten)) sum++;
            }
        }
        return sum;
    }
}