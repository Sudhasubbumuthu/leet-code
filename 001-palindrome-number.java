/* 9. Palindrome Number: Given an integer x, return true if x is a 
palindrome, and false otherwise*/

class Solution {
    public boolean isPalindrome(int x) {
       int s = 0,i = x;
       while(i > 0){
           s = (s*10) + (i%10);
           i /= 10;
       }
       if(s == x)
       return true;
       else
       return false;
    }
}
