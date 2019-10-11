package String;

import java.util.*;

public class CommonCharacters {
    public List<String> commonChars(String[] A){
        List<String> result = new ArrayList<>();
        int[] dict = new int[26];
        for(int i = 0; i < A[0].length(); i++)
            dict[A[0].charAt(i) - 'a']++;
        for(int i = 1; i < A.length; i++){
            int[] curr = new int[26];
            for(int j = 0; j < A[i].length(); j++)
                curr[A[i].charAt(j) - 'a']++;
            for(int j = 0; j < 26; j++){
                if(curr[j] < dict[j])
                    dict[j] = curr[j];
            }
        }
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < dict[i]; j++)
                result.add(Character.toString((char)('a' + i)));
        }
        return result;
    }

    public static void main(String[] args) {
        CommonCharacters com = new CommonCharacters();
        String[] A = {"cool","lock","cook"};
        List<String> result = com.commonChars(A);
        for(String str : result)
            System.out.println(str);
    }
}
