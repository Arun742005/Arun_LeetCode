class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int cal=n-k;
        reverse(nums ,0,cal-1);
        reverse(nums,cal,n-1);
        reverse(nums,0,n-1);
    }

        private void reverse(int[] arr,int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        
}