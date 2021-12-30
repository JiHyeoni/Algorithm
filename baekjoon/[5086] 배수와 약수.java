import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a==0&&b==0) break;

            if(a>b){
                if(a%b==0) System.out.println("multiple");
                else System.out.println("neither");
            }

            else{
                if(b%a==0) System.out.println("factor");
                else System.out.println("neither");
            }
        }
    }
}