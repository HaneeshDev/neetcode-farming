class Solution {
    public boolean isPalindrome(String s) {


        StringBuilder s1 = new StringBuilder();

        for(char c : s.toCharArray()){

            if(Character.isLetterOrDigit(c)){
                s1.append(Character.toLowerCase(c));
            }

        }

        StringBuilder rev = new StringBuilder(s1.toString());
        rev.reverse();

        return s1.toString().equals(rev.toString());



        
    }
}