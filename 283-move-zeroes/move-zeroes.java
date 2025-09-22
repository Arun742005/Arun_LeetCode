class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length){
            nums[j] =0;
            j++;
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