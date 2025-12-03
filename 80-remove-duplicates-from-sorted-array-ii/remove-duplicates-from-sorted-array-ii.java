class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int num :  nums){
            if(i < 2 || num != nums[i-2]){
                nums[i] = num;
                i++;
            }
        }
        return i;
        // if(nums.length <=2) return nums.length;

        // int i=2;
        // for(int j=2; j<nums.length;j++){
        //     if(nums[i-2] != nums[j]){
        //         nums[i] = nums[j];
        //         i++;
        //     }
        // }
        // return i;
    }
}