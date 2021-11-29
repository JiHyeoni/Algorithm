import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());;
        int arr[] = new int[N];
        int arrClone[];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(st.nextToken());
            arr[i]=num;
        }
        arrClone=arr.clone();
        Arrays.sort(arrClone);

        int count=0;
        for(int i=0;i<arrClone.length;i++){
            if(!map.containsKey(arrClone[i])){
                map.put(arrClone[i],count++);
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<N;i++){
            sb.append(map.get(arr[i])+" ");
        }

        System.out.println(sb);
    }
}