import java.util.*;

class Main{
    public static void main(String []args){
        int [] arr=new int[26];
        Arrays.fill(arr,-1);
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-97]==-1) arr[str.charAt(i)-97]=i;
        }

        for(int i=0;i<26;i++){
            System.out.print(arr[i]+" ");
        }
    }
}