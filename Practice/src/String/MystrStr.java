package String;

public class MystrStr {
    public int mystrStr(String haystack, String needle){
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l1 < l2)
            return -1;
        else if(l2 == 0)
            return 0;
        for(int i = 0; i <= l1 - l2; i++)
            if(haystack.substring(i, l2 + i).equals(needle))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        MystrStr my = new MystrStr();
        System.out.println(my.mystrStr("hello", "ll"));
    }
}
