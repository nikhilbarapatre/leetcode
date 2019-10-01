package String;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed){
        char[] nameArray = name.toCharArray(), typedArray = typed.toCharArray();
        int n = 0, t = 0;
        while(n < nameArray.length && t < typedArray.length){
            int need = 1;
            char c = nameArray[n++];
            while(n < nameArray.length && c == nameArray[n]){
                need++;
                n++;
            }
            while(t < typedArray.length && typedArray[t] == c){
                t++;
                need--;
            }
            if(need > 0)
                return false;
        }
        return n == nameArray.length && t == typedArray.length;
    }

    public static void main(String[] args) {
        LongPressedName l = new LongPressedName();
        System.out.println(l.isLongPressedName("alllleeex","alleeeeexx"));
    }
}