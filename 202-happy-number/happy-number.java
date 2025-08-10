class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquare(n);

        while(fast!=1 && slow != fast){
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        }
        return fast == 1;
    }

    private int sumOfSquare(int num){
        int sum=0;
        while(num > 0){
            int digit = num%10;
            sum+=digit*digit;
            num/=10;
        }
        return sum;
    }
}