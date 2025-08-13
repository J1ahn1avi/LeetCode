//204. Count Primes
class Solution {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        boolean[] isPrime = new boolean[n];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        int count = 0;
        for (boolean i : isPrime) {
            if (!i) {
                count++;
            }
        }
        return count;
    }
}
