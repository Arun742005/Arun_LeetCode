class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count=0;
    //     while(sb.length() < b.length()){
    //         sb.append(a);
    //         count++;
    //     }
    //     if(isSubstring(sb.toString(),b)){
    //      return count;
    //     }

    //     sb.append(a);
    //     count++;
    //     if(isSubstring(sb.toString(),b)){
    //         return count;
    //     }
    //     return -1;
    // }
    // public boolean isSubstring(String str,String sub){
    //     for(int i=0;i<=str.length()-sub.length(); i++){

    //         int j=0;
    //         while(j<sub.length() && str.charAt(i+j) == sub.charAt(j)){
    //             j++;
    //         }

    //         if(j==sub.length()){
    //             return true;
    //         }
    //     }
    //     return false;

        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }
            if(sb.toString().contains(b)) return count;

            sb.append(a);
            count++;

            if(sb.toString().contains(b)) return count;

        return -1;
    }
}