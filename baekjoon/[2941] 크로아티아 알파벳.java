import java.util.*;

class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='c'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='=') i++;
                    else if(str.charAt(i+1)=='-') i++;
                }
            }
            else if(str.charAt(i)=='d'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='z'){
                        if(i+2<str.length()){
                            if(str.charAt(i+2)=='=') i+=2;
                        }
                    }
                    else if(str.charAt(i+1)=='-') i++;
                }
            }
            else if(str.charAt(i)=='l'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='j') i++;
                }
            }
            else if(str.charAt(i)=='n'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='j') i++;
                }
            }
            else if(str.charAt(i)=='s'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='=') i++;
                }
            }
            else if(str.charAt(i)=='z'){
                if(i+1<str.length()){
                    if(str.charAt(i+1)=='=')i++;
                }
            }
            cnt++;
        }

        System.out.print(cnt);
    }
}