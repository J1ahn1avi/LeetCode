//771. Jewels and Stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (char i : stones.toCharArray()) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (char i : jewels.toCharArray()) {
            count += dict.getOrDefault(i, 0);
        }
        return count;
    }
}
