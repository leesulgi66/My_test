public class testTwoNumSum {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            int c = (a < b)? a : b; //항상 c에 더 작은 수가 담기게.
            int d = (a > b)? a : b;

            long sum = 0;

            for (int i=c; i<d+1;i++) {
                sum += i;
            }
            return sum;
        }
    }
    public static void main(String[] args) {

    }
}
