class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 0;

        for(int num : nums){
            high = Math.max(num , high);
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(countSum(nums , mid) > threshold){
                low = mid +1;
            }else{
                high = mid ;
            }
        }
        return low;
    }
    private long countSum(int[] nums , int divisor){
        long sum =0l;
        for(int num : nums){
            sum+=(num + divisor -1) / divisor;
        }
        return sum;
    }
}