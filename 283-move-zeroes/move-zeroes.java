class Solution {

    void swap(int[] nums,int i, int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp ;
    }

    public void moveZeroes(int[] nums) {

        int j=0;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
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
        
        
    }
}