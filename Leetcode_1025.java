class Solution {
    public boolean divisorGame(int n) {
        if (n == 1) {
            return false;
        } else {
            return !divisorGame(n - 1);
        }
    }
}
