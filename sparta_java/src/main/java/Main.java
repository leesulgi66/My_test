public class Main {
    public static void main(String[] args) {
        // write your code here
        int a = 4;
        int b = 7;

        int c = (a < b)? a : b; //항상 c에 더 작은 수가 담기게.
        int d = (a > b)? a : b;
        System.out.println(c);
        System.out.println(d);
        long sum = 0;

        for (int i=c; i<d+1;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

