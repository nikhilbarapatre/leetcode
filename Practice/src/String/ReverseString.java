package String;

public class ReverseString {
    public char[] reverseString(char[] s){
        int start = 0, end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }

    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        char[] result = rev.reverseString(s);
        for(char c : result)
            System.out.println(c);
    }
}
