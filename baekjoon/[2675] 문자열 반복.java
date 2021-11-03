import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            String tmp="";
            int r=s.nextInt();
            String st=s.next();
            for(int j=0;j<st.length();j++){
                for(int k=0;k<r;k++){
                    tmp+=st.charAt(j);
                }
            }
            System.out.println(tmp);
        }
    }
}