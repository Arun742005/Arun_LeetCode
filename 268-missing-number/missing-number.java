class Solution {
    public int missingNumber(int[] nums) {

        int n= nums.length;
        int total = n * (n+1) /2;

        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        return total - sum;

        // int absuluteTotal = 0;
        // int actualTotal = 0;
        // int n=nums.length;
        //     absuluteTotal = n * (n+1) / 2;
        // for(int i = 0 ; i<nums.length ; i++){
        // //    int  actualTotal +=nums[i];
        //     actualTotal += nums[i];
        // }
        // int missingelement = absuluteTotal - actualTotal;
        // return missingelement;
    }
}