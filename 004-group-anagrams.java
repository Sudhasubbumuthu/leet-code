//49.group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sort = String.valueOf(ch);
            if(!mp.containsKey(sort)){
                mp.put(sort,new ArrayList<String>());
            }
            //we write add because hashmap contains key with list of values as list so 'add' is included
            mp.get(sort).add(str);
        }
        List<List<String>> ans = new ArrayList<>(mp.values()); 
        return ans;
    }
}
//method 2 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            ArrayList<String> l1 = new ArrayList<>();
            String s1 = strs[i];
           if(s1!="0")
           {
            l1.add(s1);
            
            for (int j = i + 1; j < strs.length; j++) {
                String t = strs[j];
                if(s1.length() != t.length()){
                    continue;
                }
                char[] str1 = s1.toCharArray();
                char[] str2 = t.toCharArray();
                Arrays.sort(str1);
                Arrays.sort(str2);
                
                if (Arrays.equals(str1, str2)) {
                    l1.add(strs[j]);
                    strs[j]="0";
                    
                }
            }
            arr.add(l1);
           }
        }
        return arr;
    }
}
