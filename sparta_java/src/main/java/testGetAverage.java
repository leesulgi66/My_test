public class testGetAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // write your code here
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        System.out.println(answer/arr.length);
    }
}
