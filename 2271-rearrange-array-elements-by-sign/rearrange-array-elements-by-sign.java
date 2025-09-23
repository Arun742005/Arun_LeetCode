class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int posindex =0 , negindex =1;

        for(int num : nums){
            if(num >0){
                ans[posindex] = num;
                posindex +=  2;
            }else{
                ans[negindex] = num;
                negindex += 2;
            }
        }
        return ans;
        // List<Integer>pos = new ArrayList<>();
        // List<Integer>neg = new ArrayList<>();

        // for(int num : nums){
        //     if(num > 0 )
        //         pos.add(num);
        //     else
        //         neg.add(num); 
        // }
        // int[] result = new int[nums.length];
        // int i = 0, p = 0, n = 0;

        // while(p < pos.size() && n < neg.size()){
        //     result[i++] = pos.get(p++);
        //     result[i++] = neg.get(n++);

        // }
        // return result;
    }
}