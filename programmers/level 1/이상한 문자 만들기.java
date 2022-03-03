class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') {
                cnt=0;
                answer+=" ";
                continue;
            }
            else if(cnt%2==0){
                answer+=Character.toUpperCase(s.charAt(i));
            }
            else if(cnt%2!=0){
                answer+=Character.toLowerCase(s.charAt(i));
            }
            cnt++;
        }
        return answer;
    }
}