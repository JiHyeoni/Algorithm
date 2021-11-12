import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a==0&&b==0&&c==0) break;
            if((a*a+b*b)==c*c) System.out.println("right");
            else if((a*a+c*c)==b*b) System.out.println("right");
            else if((b*b+c*c)==a*a) System.out.println("right");
            else System.out.println("wrong");

        }
    }
}