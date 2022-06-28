import java.util.Arrays;

public class testDivisonAndArray {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] newarr = new int[arr.length];
        int cnt = 0;
        // write your code here
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++){
            if (arr[i]/divisor>0 && arr[i]%divisor == 0){
                System.out.println(arr[i]);
                newarr[i] = arr[i];
                cnt ++;
            }
        }
        int[] answer = new int[cnt];
        int setcnt = 0;
        for (int j=0; j<arr.length;j++){
            if (newarr[j]>0){
                answer[setcnt]= newarr[j];
                System.out.println(answer[setcnt]);
                setcnt ++;
            }
        }
        if (answer.length > 0){
            System.out.println(Arrays.toString(answer));
        }else {
            answer = new int[]{-1};
        }
    }
}
