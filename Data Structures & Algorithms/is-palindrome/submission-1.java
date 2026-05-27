class Solution {
    public boolean isPalindrome(String s) {


        ArrayList<Character> s1 = new ArrayList<>();
        ArrayList<Character> rev = new ArrayList<>();



        for(char c : s.toCharArray()){

            if(Character.isLetterOrDigit(c)){
                s1.add(Character.toLowerCase(c));
                
            }

        }
        System.out.println(s1);

        for(int i = s1.size() - 1; i >= 0; i--){
            rev.add(s1.get(i));
        }

        System.out.println(rev);


        return s1.equals(rev);

        
    }
}