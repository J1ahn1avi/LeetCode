//1399. Count Largest Group

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> res = new HashMap<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if (res.containsKey(sum)) {
                res.put(sum, res.get(sum) + 1);
            } else {
                res.put(sum, 1);
            }
            sum = 0;
        }
        int max = 0;
        for (int i : res.values()) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        for (int i : res.values()) {
            if (i == max)
                count++;
        }
        return count;

    }
}
