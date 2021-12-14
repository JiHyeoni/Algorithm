import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] arr=new int[N];
        int [] arrClone;
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        arrClone=arr.clone();
        Arrays.sort(arrClone);

        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<N;i++){
            if(!map.containsKey(arrClone[i])){
                map.put(arrClone[i],count++);
            }
        }

        for(int x : arr){
            sb.append(map.get(x)+" ");
        }
        System.out.println(sb);
    }
}
