import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int compareTo(Point o){
        if(o.y==this.y)
            return this.x-o.y;
        else return this.y-o.y;
    }
}

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<Point> list=new ArrayList<>();

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            list.add(new Point(x,y));
        }

        Collections.sort(list);

        for(Point o:list){
            System.out.println(o.x+" "+o.y);
        }
    }
}