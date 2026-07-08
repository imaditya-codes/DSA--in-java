class Solution {
    public String longestCommonPrefix(String[] strs) {
//         int n=strs.length;
//         if(n==0){
//             return "";
//         }
//         if(n==1){
//             return strs[0];
//         }
//         String prefix=commonPrefix(strs[0],strs[1]);
//         for(int i=2;i<n;i++){
//             prefix=commonPrefix(prefix,strs[i]);
//             if(prefix.isEmpty()){
//                 return "";
//             }
//         }
//         return prefix;
//     }
//     private String commonPrefix(String s1,String s2){
//         int minLength=Math.min(s1.length(),s2.length());
//         int i=0;
//         while(i<minLength && s1.charAt(i)==s2.charAt(i)){
//             i++;
//         }
//         return s1.substring(0,i);
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1; i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                return "";
                }
            }
        }
        return prefix;
    }
}