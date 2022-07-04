package testNum18;

public class testNum18 {
    public static void main(String[] args) {
        String[] seoul = {"Jaie", "Jhone", "Kim"};
        // 서울에서 김서방 찾기
        int cnt = 0;
        for (int i =0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                cnt = i;
            }
        }
        String answer = String.format("김서방은 %d에 있다",cnt);
        System.out.println(answer);

    }
}
