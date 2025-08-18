//392. Is Subsequence
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> dict = new HashMap<>();
        for (String i : words) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        char ch[] = s.toCharArray();

        for (String i : dict.keySet()) {
            char temp[] = i.toCharArray();
            int left = 0, right = 0;

            while (left < ch.length && right < temp.length) {
                if (ch[left] == temp[right]) {
                    left++;
                    right++;
                } else {
                    left++;
                }
            }
            if (right == temp.length) {
                res += dict.get(i);
            }
        }
        return res;
    }
}
