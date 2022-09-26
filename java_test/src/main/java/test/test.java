package test;

public class test {
    public static void main(String[] args) {
        String postGender = "남성";
        String memberGender = "여성";
        String memberAge = "40대";
        String age = "40대~30대";

        if(postGender.equals("모든성별")){
            System.out.println("gender join1");
        }else if (postGender.equals(memberGender)) {
            System.out.println("gender join2");
        }else {
            System.out.println("참여 할 수 없는 성별입니다");
        }

        System.out.println(age.length());
        int ageMin = Integer.parseInt(age.split("~")[0].split("대")[0]);
        int ageMax = Integer.parseInt(age.split("~")[1].split("대")[0]);
        int memberAgeInt = Integer.parseInt(memberAge.split("~")[0].split("대")[0]);
        int setAge = 0;

        if (age.equals("모든나이")) {
            System.out.println("join1");
        }
        //나이 순서 정렬
        if (ageMin > ageMax) {
            setAge = ageMin;
            ageMin = ageMax;
            ageMax = setAge;
        }
        System.out.println(memberAgeInt);
        System.out.println(ageMax);
        System.out.println(ageMin);

        if (memberAgeInt <= ageMax && memberAgeInt >= ageMin){
            System.out.println("join2");
        }else {
            System.out.println("dont join");
        }
    }

}

