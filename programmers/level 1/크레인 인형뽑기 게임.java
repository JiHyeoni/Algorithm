import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int top[]=new int[board.length];
        Arrays.fill(top,Integer.MAX_VALUE);
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(top[j]==Integer.MAX_VALUE&&board[i][j]!=0) {
                    top[j] = i;
                }
            }
            System.out.println();
        }

        for(int i=0;i<moves.length;i++){

            if(top[moves[i]-1]>=board.length) continue;
            int number=board[top[moves[i]-1]][moves[i]-1];
            board[top[moves[i]-1]][moves[i]-1]=0;
            top[moves[i]-1]++;

            if(!stack.isEmpty()&&stack.peek()==number){
                answer+=2;
                stack.pop();
            }
            else{
                stack.add(number);
            }
        }
        return answer;
    }

}