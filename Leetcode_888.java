//888. Fair Candy Swap  
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma = 0, sumb = 0;
        for (int i : aliceSizes) {
            suma += i;
        }
        for (int i : bobSizes) {
            sumb += i;
        }
        int del = (sumb - suma) / 2;
        Set<Integer> seen = new HashSet<>();
        for (int i : bobSizes) {
            seen.add(i);
        }
        for (int i : aliceSizes) {
            int res = i + del;
            if (seen.contains(res)) {
                return new int[] { i, res };
            }
        }
        return new int[0];
    }
}
