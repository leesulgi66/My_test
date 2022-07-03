import java.util.Arrays;

public class Main {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] numbase = new int[arr1.length][arr1.length];


        int[][] answer = {{}};
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[][] arr1 = {{5,7,1},{2,3,5}};
        int[][] arr2 = {{5,1,6},{7,5,6}};
        boolean[][] signs={{true,true,false},{false,true,false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}