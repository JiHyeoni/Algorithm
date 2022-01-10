import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<t;i++){
            String p=br.readLine();
            int n=Integer.parseInt(br.readLine());
            Deque<Integer> deque=new LinkedList<>();
            String str=br.readLine();

            checkDigit(deque, str);

            boolean check=true;
            boolean Dcheck=true;

            for(int k=0;k<p.length();k++){
                if(p.charAt(k)=='R') check=(!check);
                else if(p.charAt(k)=='D'){
                    if(deque.isEmpty()){
                        sb.append("error").append("\n");
                        Dcheck=false;
                        break;
                    }
                    else if(check==true) deque.pollFirst();
                    else if(check==false) deque.pollLast();
                }
            }

            if(Dcheck==false) continue;
            else{
                sb.append("[");
                if(deque.isEmpty()) sb.append("]").append("\n");
                else if(check==true){
                    while(deque.size()!=1){
                        sb.append(deque.pollFirst()).append(",");
                    }
                    sb.append(deque.pollFirst()).append("]").append("\n");
                }
                else if(check==false){
                    while(deque.size()!=1){
                        sb.append(deque.pollLast()).append(",");
                    }
                    sb.append(deque.pollLast()).append("]").append("\n");
                }

            }
        }

        System.out.println(sb);
    }

    private static void checkDigit(Deque<Integer> deque, String str) {
        for(int j = 0; j< str.length(); j++){
            int num=0;
            if(Character.isDigit(str.charAt(j))){
                num= str.charAt(j)-'0';
                if(j+1< str.length()&&Character.isDigit(str.charAt(j+1))){
                    num=num*10+(str.charAt(j+1)-'0');
                    j++;
                    if(j+1< str.length()&&Character.isDigit(str.charAt(j+1))){
                        num=num*10+(str.charAt(j+1)-'0');
                        j++;
                    }
                }
                deque.addLast(num);
            }
        }
    }
}