class Solution {
    public long solution(long n) {
        long answer = -1;

        long number=(long)Math.sqrt(n);

        if((long)Math.pow(number,2)==n){
            answer=(long)Math.pow(number+1,2);
        }

        return answer;
    }
}