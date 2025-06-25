class Solution {
    public int missingNumber(int[] nums) {

        int absuluteTotal = 0;
        int actualTotal = 0;
        int n=nums.length;
            absuluteTotal = n * (n+1) / 2;
        for(int i = 0 ; i<nums.length ; i++){
        //    int  actualTotal +=nums[i];
            actualTotal += nums[i];
        }
        int missingelement = absuluteTotal - actualTotal;
        return missingelement;
    }
}