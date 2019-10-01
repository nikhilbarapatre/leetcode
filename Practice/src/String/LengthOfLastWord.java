package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        String[] split = s.split(" ");
        if(split.length == 0)
            return 0;
        else
            return split[split.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord len = new LengthOfLastWord();
        System.out.println(len.lengthOfLastWord("Hello World"));
    }
}
