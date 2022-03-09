class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int cnt=1;
        while(cnt<=count){
            answer+=cnt*price;
            cnt++;
        }
        answer-=money;
        return answer>0?answer:0;
    }
}