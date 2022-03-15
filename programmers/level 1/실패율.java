import java.util.*;

class Game{
    int stage;
    double failure;
    public Game(int stage,double failure){
        this.stage=stage;
        this.failure=failure;
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int people=stages.length;
        ArrayList<Game> game=new ArrayList<>();

        for(int i=1;i<=N;i++){
            if(people==0) game.add(new Game(i,0.0d));
            else{
                int count=0;
                for(int j=0;j<stages.length;j++){
                    if(stages[j]==i) count++;
                }
                game.add(new Game(i,(double)count/people));
                people-=count;
            }
        }
        Collections.sort(game,((o1, o2) -> Double.compare(o2.failure, o1.failure)));
        int[] answer = new int [N];
        for(int i=0;i<N;i++){
            answer[i]=game.get(i).stage;
        }
        return answer;
    }
}