import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String [] arr= new String[N];
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
            min=Math.min(min,arr[i].length());
            max=Math.max(max,arr[i].length());
        }

        ArrayList<String> list1=new ArrayList<>();

        for(int i=min;i<=max;i++){
            ArrayList<String> list2=new ArrayList<>();
            for(int j=0;j<N;j++){
                if(i==arr[j].length()&&!list2.contains(arr[j])) list2.add(arr[j]);
            }
            if(list2.size()!=0){
                Collections.sort(list2);
                list1.addAll(list2);
            }
        }

        for(String str:list1){
            System.out.println(str);
        }
    }
}