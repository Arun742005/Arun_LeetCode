class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;

        for(int i=0 ; i<n ; i++){
            int start = nums[i];
            int j=i;

            while(j+1<n && nums[j+1] == nums[j] +1){
                j++;
            }

            if(start == nums[j]){
                result.add(String.valueOf(start));
            }else{
                result.add(nums[i] + "->" + nums[j]);
            }
            i=j;
        }
        return result;
    }
}