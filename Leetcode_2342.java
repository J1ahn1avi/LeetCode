//2342. Max Sum of a Pair With Equal Sum of Digits
class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> res = new HashMap<>();

        for (int i : nums) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (!res.containsKey(sum)) {
                res.put(sum, new ArrayList<>());
            }

            res.get(sum).add(i);

        }

        int temp = -1;

        for (List<Integer> arr : res.values()) {

            if (arr.size() >= 2) {
                Collections.sort(arr);//sorting the arr to get the maximum values
                int n = arr.size();
                temp = Math.max(temp, (arr.get(n - 2) + arr.get(n - 1)));
            }

        }
        
        return temp;
    }
}
