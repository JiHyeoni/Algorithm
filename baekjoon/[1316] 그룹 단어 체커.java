import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int cnt=0;
        for(int i=0;i<num;i++){
            String str=s.next();
            if(check(str)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean check(String str){
        boolean [] arr=new boolean[26];
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-97]==false) arr[str.charAt(i)-97]=true;
            else{
                if(i-1>0){
                    if(str.charAt(i)!=str.charAt(i-1)) return false;
                }
            }
        }
        return true;
    }
}