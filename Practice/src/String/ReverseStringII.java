package String;

public class ReverseStringII {
    public String reverseStr(String s, int k){
        char[] a = s.toCharArray();
        for(int start = 0; start < a.length; start += 2 * k){
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while(i < j){
                char temp = a[i];
                a[i++] = a[j];
                a[j--] = temp;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        ReverseStringII rev = new ReverseStringII();
        String result = rev.reverseStr("abcdefg", 2);
        System.out.println(result);
    }
}
