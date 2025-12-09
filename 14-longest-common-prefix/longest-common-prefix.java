class Solution {
    public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";

//         int minLen = Integer.MAX_VALUE;
//         for (String str : strs) {
//             minLen = Math.min(minLen, str.length());
//         }

//         int low = 1, high = minLen;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (isCommonPrefix(strs, mid)) {
//                 low = mid + 1;  // try for a longer prefix
//             } else {
//                 high = mid - 1; // try for a shorter prefix
//             }
//         }

//         return strs[0].substring(0, (low + high) / 2);
//     }

//     private boolean isCommonPrefix(String[] strs, int len) {
//         String prefix = strs[0].substring(0, len);
//         for (int i = 1; i < strs.length; i++) {
//             if (!strs[i].startsWith(prefix)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

        if(strs == null || strs.length == 0 ) return "";

        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}