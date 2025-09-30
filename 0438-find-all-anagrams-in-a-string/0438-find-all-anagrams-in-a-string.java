class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> res = new ArrayList<>();
        if (n < m) return res;
        int[] need = new int[26], win = new int[26];
        for(int i = 0; i < m; i++) need[p.charAt(i) - 'a']++;
        for(int i = 0; i < m - 1; i++) win[s.charAt(i) - 'a']++;
        for(int i = m - 1; i < n; i++) {
            win[s.charAt(i) - 'a']++;              
            if(Arrays.equals(need, win)) res.add(i - m + 1);
            win[s.charAt(i - m + 1) - 'a']--;       
        }
        return res;
    }
}
