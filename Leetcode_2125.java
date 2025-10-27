//2125. Number of Laser Beams in a Bank
class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int prev = 0;
        for (String i : bank) {
            int curr = 0;
            for (char ch : i.toCharArray()) {
                if (ch == '1') {
                    curr++;
                }
            }
            if (curr > 0) {
                res += prev * curr;
                prev = curr;
            }
        }
        return res;
    }
}
