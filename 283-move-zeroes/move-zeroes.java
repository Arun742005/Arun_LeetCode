class Solution {
    public void moveZeroes(int[] nums) {
       int pos =0;

       for(int n : nums){
            if(n != 0){
                nums[pos++] = n;
            }
       }
       while(pos < nums.length){
            nums[pos++] = 0;
       }
    }
}




        // int index = 0;
        // for(int i= 0 ; i<nums.length ; i++){
        //     if(nums[i] != 0){
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }
        //     while(nums.length > index)
        //     {
        //         nums[index] = 0;
        //         index++;
        //     }
        
        
//     }
// }