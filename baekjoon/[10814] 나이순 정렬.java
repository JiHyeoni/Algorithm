import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Member implements Comparable<Member>{
    int age;
    String name;
    int num;
    Member(int age, String name, int num){
        this.age=age;
        this.name=name;
        this.num=num;
    }

    public int compareTo(Member o){
        if(o.age==this.age){
            return this.num-o.num;
        }
        else return this.age-o.age;
    }
}

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Member> list=new ArrayList<>();

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int age=Integer.parseInt(st.nextToken());
            String name=st.nextToken();
            list.add(new Member(age,name,i));
        }

        Collections.sort(list);

        for(Member m:list){
            System.out.println(m.age +" " + m.name);
        }
    }
}