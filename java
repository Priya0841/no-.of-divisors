# no-.of-divisors
  class Solution{
    static long count_divisors(int N){
         int count = 0;
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                if (i % 3 == 0) {
                    count++;
                }
                if (i != N / i && (N / i) % 3 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
We calculate the square root of N and store it in sqrtN. We only need to iterate up to sqrtN to find divisors efficiently.
In the loop, we check if i is a divisor of N. If it is, we increment the count if i is divisible by 3.
Additionally, if i is not equal to N / i (i.e., they are distinct divisors), we check if N / i is divisible by 3 and increment the count accordingly.
This optimization reduces the time complexity of the solution from O(N) to approximately O(sqrt(N)), which should pass the given time limit for large inputs.






