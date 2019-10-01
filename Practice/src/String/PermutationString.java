package String;

import java.util.Arrays;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2){
        s1 = sort(s1);
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            if(s1.equals(sort(s2.substring(i, i + s1.length()))))
                return true;
        }
        return false;
    }

    private String sort(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        PermutationString per = new PermutationString();
        System.out.println(per.checkInclusion("ab","eidbaboo"));
    }
}
