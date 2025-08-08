//231. Power of two
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        int x = 1;
        for (int i = 0; i < 31; i++) {
            if ((int) Math.pow(2, i) == n)
                return true;
        }
        return false;
    }
}
