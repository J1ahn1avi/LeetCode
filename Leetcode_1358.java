//1358. Number of Substrings Containing All Three Characters
class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {
                count += s.length() - i;
                char temp = s.charAt(left);
                map.put(temp, map.get(temp) - 1);

                if (map.get(temp) == 0) {
                    map.remove(temp);
                }
                left++;
            }
        }
        return count;
    }
}
