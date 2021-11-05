import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.trim();

        String [] arr=str.split(" ");
        if(str.isEmpty()) System.out.print(0);
        else System.out.println(arr.length);
    }
}

/*
* import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.trim();
        if (str.isEmpty()) System.out.println(0);
        else{
        int cnt=0;
        int n=0;
        while((n=str.indexOf(' '))!=-1){
            str=str.substring(n+1);
            cnt++;
        }
        System.out.println(cnt+1);
    }
   }
}
* */