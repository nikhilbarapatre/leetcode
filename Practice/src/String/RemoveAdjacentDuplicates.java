package String;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s){
        int i = 0;
        char[] stack = new char[s.length()];
        for(int j = 0; j < s.length(); j++){
            if(i > 0 && stack[i - 1] == s.charAt(j))
                i--;
            else
                stack[i++] = s.charAt(j);
        }
        return new String(stack, 0, i);
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates rem = new RemoveAdjacentDuplicates();
        String result = rem.removeDuplicates("abbaca");
        System.out.println(result);
    }
}
