class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        
        int result = 0;
        while (dvd >= dvs) {
            dvd -= dvs;
            result++;
        }
        
        return negative ? -result : result;
    }
}
