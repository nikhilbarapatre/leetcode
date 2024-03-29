package String;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if(s.length() < 1)
            return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCentre(s, i, i);
            int len2 = expandAroundCentre(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCentre(String s, int left, int right){
        int L = left, R = right;
        while(L >= 0 && R < s.length() && s.charAt(R) == s.charAt(L)){
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lon = new LongestPalindromicSubstring();
        String result = lon.longestPalindrome("cbbd");
        System.out.println(result);
    }
}
