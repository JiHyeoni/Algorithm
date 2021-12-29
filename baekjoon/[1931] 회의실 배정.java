import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time>{
    int start;
    int end;
    Time(int start,int end){
        this.start=start;
        this.end=end;
    }

    public int compareTo(Time t){
        if(t.end==this.end){
            return this.start-t.start;
        }
        else{
            return this.end-t.end;
        }
    }
}

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Time> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            list.add(new Time(s,e));
        }
        Collections.sort(list);

        int cnt=1;
        int e_time=list.get(0).end;

        for(int i=1;i<n;i++){
            if(e_time<=list.get(i).start){
                cnt++;
                e_time=list.get(i).end;
            }
        }

        System.out.println(cnt);

    }
}