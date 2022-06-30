package testNum06;

public class testEmptyNumberSum {
    class Solution {
        public int solution(int[] numbers) {
            //없는 숫자 더하기
            int answer = 45;
            for(int num : numbers){
                answer -= num;
            }
            return answer;
        }
    }

    public static void main(String[] args) {

    }
}

