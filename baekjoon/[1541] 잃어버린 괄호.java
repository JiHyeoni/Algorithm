
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        ArrayList<Integer> number=new ArrayList<>();
        ArrayList<Character> operation=new ArrayList<>();

        int num=0;

        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num=num*10+(str.charAt(i)-'0');
            }
            else{
                number.add(num);
                operation.add(str.charAt(i));
                num=0;
            }
        }
        number.add(num);

        for(int i=0;i<operation.size();i++){
            if (operation.get(i)=='+'){
                number.set(i+1,number.get(i)+number.get(i+1));
                number.set(i,0);
            }
        }

        Integer op=null;
        for(int i=0;i<number.size();i++){
            if(op==null&&number.get(i)!=0){
                op=number.get(i);
            }
            else if(op!=null) op-=number.get(i);
        }
        System.out.println(op);

    }
}