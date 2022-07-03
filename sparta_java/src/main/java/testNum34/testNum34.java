package testNum34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/68935
//3진법 뒤집기
public class testNum34 {
    public int solution(int n) {
//        String num = Integer.toString(n, 3);  //3진수로 변경
//        String[] nums = num.split(""); //배열로 변경 [1,2,0,0,]
//        List<String> emptyNum = new ArrayList<>();
//
//        for (int i=nums.length-1; i >= 0; i--){  //역순으로 list.add
//            emptyNum.add(nums[i]);
//        }
//        System.out.println(Collections.unmodifiableList(emptyNum)); //배열 상태 체크 [0,0,2,1]
//
//        String result = "";
//        for (String item : emptyNum){
//            result += item;
//        }
//        System.out.println(result);  //[0021] 문자열;
//        int answer = Integer.parseInt(result, 3);
//        System.out.println(answer);
        //-----------------------------------------------------------------------두번째
        List<Integer> numlist = new ArrayList<>();
        while (n > 0) {
            int i = n%3;
            numlist.add(i);
            n = n/3;
        }
        //System.out.println(numlist); //list 확인  [0,0,2,1]
        String result = "";
        for (Integer i : numlist){
            result += i;
        }
        int intNum = Integer.parseInt(result);
        int answer = intNum/3;


        return answer;
    }


    public static void main(String[] args) {
        testNum34 testNum34 = new testNum34();
        int answer = testNum34.solution(45);
        System.out.println(answer);
    }

}
