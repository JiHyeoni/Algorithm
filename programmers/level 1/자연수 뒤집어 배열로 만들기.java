class Solution {
    public int[] solution(long n) {
        char[] number=String.valueOf(n).toCharArray();
        int[] answer = new int[number.length];
        for(int i=0;i<number.length;i++){
            answer[i]=number[number.length-1-i]-'0';
        }
        return answer;
    }
}