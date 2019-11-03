package String;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        String[] letters = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length() == 0)
            return result;
        result.add("");
        for(int i = 0; i < digits.length(); i++)
            result = combineHelper(letters[digits.charAt(i) - '0'], result);
        return result;
    }

    private List<String> combineHelper(String digits, List<String> list){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < digits.length(); i++)
            for(String word : list)
                result.add(word + digits.charAt(i));
        return result;
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber letter = new LetterCombinationsOfPhoneNumber();
        List<String> result = letter.letterCombinations("34");
        for(String word : result)
            System.out.println(word);
    }
}
