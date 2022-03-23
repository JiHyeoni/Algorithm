class Solution {
    static int answer;
    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers,target,0,0);
        return answer;
    }

    public static void dfs(int [] numbers, int target, int L, int sum){
        if(L==numbers.length){
            if(sum==target) answer++;
            return;
        }
        else{
            dfs(numbers,target,L+1,sum+numbers[L]);
            dfs(numbers,target,L+1,sum-numbers[L]);
        }
    }
}