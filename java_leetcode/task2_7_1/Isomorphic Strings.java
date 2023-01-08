//Isomorphic Strings
//link: https://leetcode.com/problems/isomorphic-strings/
//easy

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map <Character,Character> mp =new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(mp.containsKey(s.charAt(i))) {
                if(mp.get(s.charAt(i))!=t.charAt(i)) return false;
            } else if (mp.containsValue(t.charAt(i))) {
			return false;
		} else {
                mp.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}

