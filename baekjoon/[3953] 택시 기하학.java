import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        System.out.printf("%.6f\n",r*r*Math.PI);
        System.out.printf("%.6f\n",2*r*r);
    }
}