class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s1 = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(s1) != 0){
                s1 = s1.substring(0, s1.length() - 1);
            }
           
        }

        return s1;
        
    }
}