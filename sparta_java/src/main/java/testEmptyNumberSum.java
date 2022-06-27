public class testEmptyNumberSum {
    class Solution {
        public int solution(int[] numbers) {
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

