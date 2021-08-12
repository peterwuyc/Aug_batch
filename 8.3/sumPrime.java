/**
 * date: 08/03/2021 name: PLYU description: sum all primes in 100
 */

public class sumPrime {
    public sumPrime() {
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sum_Prime(int m) {
        int ans = 0;
        for (int i = 2; i < m; ++i) {
            if (this.isPrime(i)) {
                ans += i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // solution
        sumPrime solution = new sumPrime();
        // parameter can be changed
        int ans = solution.sum_Prime(100);
        System.out.println(ans); // 1060

    }
}
