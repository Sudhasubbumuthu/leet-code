// 125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder s1 = new StringBuilder();
       for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                s1.append(Character.toLowerCase(c));
       }
       int l = 0, r = s1.length()-1;
       System.out.print(s1);
       while(l <= r){
            char left = s1.charAt(l);
            char right = s1.charAt(r);
            if(Character.toLowerCase(left) != Character.toLowerCase(right))
                return false;
            l++;
            r--;
       } 
       return true;
    }
}
