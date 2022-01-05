import java.util.*;

class Print{
    int p;
    int o;
    Print(int p,int o){
        this.p=p;
        this.o=o;
    }
}

class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<t;i++){

            int n=s.nextInt();
            int m=s.nextInt();
            LinkedList <Print> queue=new LinkedList<>();

            for(int j=0;j<n;j++){
                int num=s.nextInt();
                queue.offer(new Print(num,j));
            }
            int count=0;
            while(true){
                Print front=queue.poll();
                boolean check=true;
                for(int k=0;k<queue.size();k++){
                    if(front.p<queue.get(k).p){
                        queue.offer(front);
                        for(int l = 0; l < k; l++) {
                            queue.offer(queue.poll());

                        }
                        check=false;
                        break;
                    }
                }
                if(check==false){
                    continue;
                }
                count++;
                if(front.o==m){
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}