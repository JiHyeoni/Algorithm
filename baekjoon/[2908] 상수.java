import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();

        int num3=0;
        int num4=0;
        while(num1!=0&&num2!=0){
            num3=num3*10+num1%10;
            num4=num4*10+num2%10;
            num1/=10;
            num2/=10;
        }

        System.out.println(num3>num4?num3:num4);
    }
}