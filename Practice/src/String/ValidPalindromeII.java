package String;

/*
* In this question, we have to return if the given string is a valid palindrome or not. We can also delete at least
* one character to check for the palindromic property of the string.
* */

public class ValidPalindromeII {
    public boolean validPalindrome(String s){
       int i = 0, j = s.length() - 1;
       while(i < j && s.charAt(i) == s.charAt(j)){
           i++;
           j--;
       }
       if(i >= j)
           return true;
       if(isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1))
           return true;
       return false;
    }

    private boolean isPalindrome(String s, int i , int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII valid = new ValidPalindromeII();
        System.out.println(valid.validPalindrome("abcda"));
    }
}
