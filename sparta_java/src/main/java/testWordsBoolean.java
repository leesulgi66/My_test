import java.util.Locale;

public class testWordsBoolean {
    public static void main(String[] args) {
        String s = "pPoooyY";
        // write your code here
        String a = s.toLowerCase();
        int cnt = 0;
        for(int i=0; i<a.length();i++){
            if (a.charAt(i)=='p'){
                cnt ++;
            }else if(a.charAt(i)=='y'){
                cnt --;
            }
        }
        if (cnt == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
