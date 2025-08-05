//290. Word Pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, Integer> dict1 = new HashMap<>();
        HashMap<String, Integer> dict2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            int idx1 = dict1.getOrDefault(ch, i);
            int idx2 = dict2.getOrDefault(word, i);

            if (idx1 != idx2)
                return false;

            dict1.put(ch, idx1);
            dict2.put(word, idx2);
        }
        return true;
    }
}
