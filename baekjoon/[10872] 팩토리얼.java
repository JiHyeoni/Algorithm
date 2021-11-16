import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
}