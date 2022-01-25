import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Document{
    int priority;
    int order;
    Document(int priority,int order){
        this.priority=priority;
        this.order=order;
    }
}

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Document> queue = new LinkedList<Document>();
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                queue.add(new Document(Integer.parseInt(st.nextToken()),j));
            }
            System.out.println(Printer(queue,m));
            queue.clear();
        }
    }

    public static int Printer(LinkedList<Document> queue,int m){
        int number=1;
        while(!queue.isEmpty()){
            int max=0;
            for(int i=0;i<queue.size();i++){
                if(queue.get(i).priority>max){
                    max=queue.get(i).priority;
                }
            }
            while(max!=queue.peekFirst().priority){
                queue.offerLast(queue.pollFirst());
            }
            if(queue.pollFirst().order==m) break;
            else number++;
        }
        return number;
    }
}