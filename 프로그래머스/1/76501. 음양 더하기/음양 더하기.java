class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        int answer = 0;
        int answer1 = 0;
        int num = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            num = absolutes[i];
            System.out.println("num" + num);
            if(signs[i] == true) {
                answer += num; 
            }else {
                answer += (-(num));
            }
        }    
    
    return answer;
    }
}