import java.util.*;

class Point implements Comparable<Point>{
    int a;
    int b;
    Point(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int compareTo(Point p){
        return this.a-p.a;
    }
}

class Main{
    static ArrayList<Point> list;
    static Integer[] dp;
    static int n;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        list=new ArrayList<>();

        n=s.nextInt();
        dp=new Integer[n];

        for(int i=0;i<n;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            list.add(new Point(x,y));
        }
        Collections.sort(list);

        for(int i=n-1;i>=0;i--){
            cross(i);
        }

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        System.out.println(n-max);
    }
    public static int cross(int s){
        if(dp[s]==null){
            dp[s]=1;
            for(int i=n-1;i>s;i--){
                if(list.get(i).b>list.get(s).b){
                    dp[s]=Math.max(dp[s],cross(i)+1);
                }
            }
        }
        return dp[s];
    }
}