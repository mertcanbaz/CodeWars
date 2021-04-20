package codewars;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
    public boolean check(String sentence) {
        //code
        if (sentence != null && !sentence.isEmpty()) {
            HashMap<Character, Integer> alphabetMap = new HashMap<>();
            char[] sentenceCharArray = sentence.toLowerCase().toCharArray();

            for (char c = 'a'; c <= 'z'; ++c) {
                alphabetMap.put(c, 0);
            }

            for (Character c : sentenceCharArray) {
                if (alphabetMap.containsKey(c)) {
                    alphabetMap.put(c, alphabetMap.get(c) + 1);
                }
            }

            for (Map.Entry<Character, Integer> set : alphabetMap.entrySet()) {
                if (set.getValue().equals(0)) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }
    }

    public boolean check1(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
