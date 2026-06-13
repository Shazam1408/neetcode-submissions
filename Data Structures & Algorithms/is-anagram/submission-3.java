class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> count = new HashMap<>();

        for(int i=0; i<s.length() ; i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) +1);
        }

        for(int i=0; i<t.length() ; i++){
        char ch = t.charAt(i);
        int val = count.getOrDefault(ch, 0) - 1;
        if (val < 0) return false;
        count.put(ch, val);
            }

        return true;
    }
}
