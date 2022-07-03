package testNum35;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/86491//r
//최소 직사각형

public class testNum35 {
    public int solution(int[][] sizes) {
        int[][] sortsizes = new int[sizes.length][sizes[0].length];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                sortsizes[i][0] = sizes[i][0];
                sortsizes[i][1] = sizes[i][1];
            }else {
                sortsizes[i][0] = sizes[i][1];
                sortsizes[i][1] = sizes[i][0];
            }
        }
        System.out.println(Arrays.deepToString(sortsizes)); //정렬 이 완료된 2차원 배열 확인

        int height = 0;
        int width = 0;


        for (int i=0; i< sizes.length; i++){   //인덱스 0번째 제일 큰 수로 갱신
            if(sortsizes[i][0] > height) {
                height = sortsizes[i][0];
            }
        }
        for (int i=0; i< sizes.length; i++){  //인덱스 1번째 제일 큰 수로 갱신
            if(sortsizes[i][1] > width) {
                width = sortsizes[i][1];
            }
        }
        //height = 80
        //width = 50

        int answer = height * width;
        return answer;
    }


    public static void main(String[] args) {
        testNum35 testNum35 = new testNum35();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = testNum35.solution(sizes);
        System.out.println(answer);
    }
}
