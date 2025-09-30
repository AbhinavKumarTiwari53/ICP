class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        int j=0;
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}