class Solution {
    public boolean checkInclusion(String p, String s) { 
        int[] cnt = new int[128];
        for (int i = 0; i < p.length(); ++i) {
            cnt[p.charAt(i)]++;
        }
        for (int r = 0, l = 0; r < s.length(); ++r) {
            char c = s.charAt(r);
            cnt[c]--;
            while (cnt[c] < 0) { 
                cnt[s.charAt(l)]++;  
                l++;
            }
            if (r - l + 1 == p.length()) {
                return true;
            }
        }
        return false;
    }
}