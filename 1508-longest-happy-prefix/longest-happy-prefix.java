class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len=0;
        for(int i=1;i<n;i++){
            while(len >0 && s.charAt(i) != s.charAt(len)){
                len=lps[len-1];
            }
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
            }
        }
        return s.substring(0,lps[n-1]);
    }
}

// class Solution {
//     public String longestPrefix(String s) {
//         int n=s.length();
//         int i=1;
//         int len=0;
//         int lsp[]=new int[n];
//         while(i<n){
//             if(s.charAt(i)==s.charAt(len)){
//                 len++;
//                 lsp[i]=len;
//                 i++;
//             }
//             else{
//                 if(len!=0){
//                     len=lsp[len-1];
//                 }
//                 else{
//                     lsp[i]=0;
//                     i++;
//                 }
                
//             }
//         }
//          int prefixLength = lsp[n - 1];
//         return s.substring(0, prefixLength);
//     }
// }