class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 1, high = minLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;  // try for a longer prefix
            } else {
                high = mid - 1; // try for a shorter prefix
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}

        // if(strs == null || strs.length ==0) return "";

        // String prefix = strs[0];
        // for(int i=1;i<strs.length;i++){
        //     while(!strs[i].startsWith(prefix))
        //         prefix = prefix.substring(0,prefix.length() -1);
        //         if(prefix.isEmpty()) return "";
        // }
        // return prefix;
//     }
// }