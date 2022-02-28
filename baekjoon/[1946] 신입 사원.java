import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

class People implements Comparable<People>{
    int A;
    int B;
    People(int A,int B){
        this.A=A;
        this.B=B;
    }

    public int compareTo(People p){
        if(this.A==p.A)
            return this.B-p.B;
        else
            return this.A-p.A;
    }
}

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            ArrayList<People> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                st=new StringTokenizer(br.readLine()," ");
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                arr.add(new People(a,b));
            }
            Collections.sort(arr);

            int count=1;
            int min=arr.get(0).B;

            for(int j=1;j<n;j++){
                if(min>arr.get(j).B){
                    count++;
                    min=arr.get(j).B;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}