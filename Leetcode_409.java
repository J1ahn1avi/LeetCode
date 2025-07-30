//409. Longest Palindrome
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int res = 0;
        for (char i : s.toCharArray()) {
            if (!dict.containsKey(i)) {
                dict.put(i, 1);
            } else {
                dict.put(i, dict.get(i) + 1);
                if (dict.get(i) % 2 == 0) {
                    res += 2;
                }
            }
        }
        return res == s.length() ? res : res + 1;

    }
}
