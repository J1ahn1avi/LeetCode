//1456. Maximum Number of Vowels in a Substring of Given Length
class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int left = 0;
        int currCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currCount++;
            }
        }
        int max = currCount;

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(left)) != -1) {
                currCount--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currCount++;
            }
            left++;

            max = Math.max(max, currCount);

        }
        return max;
    }
}
