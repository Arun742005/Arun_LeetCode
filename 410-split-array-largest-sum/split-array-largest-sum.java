class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0 , high =0;

        for(int num : nums){
            low = Math.max(low , num);
            high += num;
        }

        while(low < high){
            int mid = low + (high - low) /2;
            if(canMake(nums , k , mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean canMake(int[] nums , int k , int limit){
        int subArray =1, currentcount=0;
        for(int num : nums){
            if(currentcount + num > limit){
                subArray++;
                currentcount=num;
                if(subArray > k) return false;
            }else{
                currentcount+=num;
            }
            
        }
        return true;
    }
}