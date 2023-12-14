/* 242 Valid Anagram*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        //count char frequency
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        //-- the frequency
        for(char c: t.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)-1);
        }
        //check non zero
        for(int v : mp.values()){
            if(v != 0)
            return false;
        }
        return true;
    }
}
