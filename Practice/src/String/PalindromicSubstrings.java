package String;

public class PalindromicSubstrings {
    public int palindromicSubstrings(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count = expandAroundCentre(s, i, i, count);
            count = expandAroundCentre(s, i, i + 1, count);
        }
        return count;
    }
    private int expandAroundCentre(String s, int left, int right, int count){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstrings pal = new PalindromicSubstrings();
        int result = pal.palindromicSubstrings("aaa");
        System.out.println(result);
    }
}
