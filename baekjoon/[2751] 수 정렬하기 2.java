import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++) arr.add(s.nextInt());
        Collections.sort(arr);
        for(int value:arr){
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}