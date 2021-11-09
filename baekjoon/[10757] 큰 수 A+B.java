import java.util.*;
import java.math.BigInteger;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        BigInteger bigInteger1=new BigInteger(str1);
        BigInteger bigInteger2=new BigInteger(str2);
        System.out.println(bigInteger1.add(bigInteger2));


    }
}