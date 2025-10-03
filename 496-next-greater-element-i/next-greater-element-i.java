class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            // Find index in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            // Look for next greater
            int next = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    next = nums2[k];
                    break;
                }
            }
            res[i] = next;
        }
        return res;
    }
}
