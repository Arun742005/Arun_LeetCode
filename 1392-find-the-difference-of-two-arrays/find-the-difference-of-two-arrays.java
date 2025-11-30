class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);

        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        for(int x : set1){
            if(!set2.contains(x)) ans1.add(x);
        }
        for(int x : set2){
            if(!set1.contains(x)) ans2.add(x);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}