import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        str=str.toUpperCase();
        int [] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-65]+=1;
        }
        int max=Integer.MIN_VALUE;
        char ch=0;
        for(int i=0;i<26;i++){
            if(max<=arr[i]){
                max=arr[i];
                ch=(char)(i+65);
            }
        }

        for(int i=0;i<26;i++){
            if(max==arr[i]&&ch!=(i+65)) ch='?';
        }
        System.out.println(ch);
    }
}