package String;

import Backtracking.GenerateParanthesis;

import java.util.*;

public class GeneratePhrases {
    public List<String> generatePhrases(List<String> phrases){
        Map<String, List<String>> first = new HashMap<>();
        Map<String, List<String>> last = new HashMap<>();
        List<String> temp;
        List<String> result = new ArrayList<>();
        for (String sent : phrases) {
            String sent_lowercase_words[] = sent.split(" ");
            if (last.containsKey(sent_lowercase_words[0]))
            {
                temp = last.get(sent_lowercase_words[0]);
                for (String prev_sent : temp) {
                    StringBuilder sb = new StringBuilder(prev_sent);

                    for (int i = 1; i < sent_lowercase_words.length; i++) {
                        sb.append(" ").append(sent_lowercase_words[i]);
                    }
                    result.add(sb.toString());
                }
            }
            if (first.containsKey(sent_lowercase_words[sent_lowercase_words.length - 1])) {
                temp = first.get(sent_lowercase_words[sent_lowercase_words.length - 1]);
                for (String t : temp) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < sent_lowercase_words.length - 1; i++) {
                        sb.append(sent_lowercase_words[i]);
                        sb.append(" ");
                    }
                    sb.append(t);
                    result.add(sb.toString());
                }
            }
            String finalSent = sent;
            first.compute(sent_lowercase_words[0], (k, v) -> {
                if (v == null) {
                    v = new ArrayList<>();
                }
                v.add(finalSent);
                return v;
            });
            last.compute(sent_lowercase_words[sent_lowercase_words.length - 1], (k, v) -> {
                if (v == null) {
                    v = new ArrayList<>();
                }
                v.add(finalSent);
                return v;
            });
        }
        return result;
    }

    public static void main(String[] args) {
        GeneratePhrases gen = new GeneratePhrases();
        List<String> sent = new ArrayList<>();
        sent.add("a quick bite to eat");
        sent.add("eat my words");
        for (String s: gen.generatePhrases(sent)) {
            System.out.println(s);
        }
    }
}
