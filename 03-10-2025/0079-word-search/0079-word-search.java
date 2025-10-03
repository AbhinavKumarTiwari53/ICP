class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length, m=board[0].length, k=word.length();
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(help(board, i, j, 0, k, word)) return true;
            }
        }
        return false;
    }
    boolean help(char[][] b, int i, int j, int idx, int k, String s){
        if(idx==k) return true;
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || s.charAt(idx)!=b[i][j] || b[i][j]=='*') return false;
        char c=b[i][j];
        b[i][j] = '*';
        boolean ans=false;
        ans |= help(b, i+1, j, idx+1, k, s);
        ans |= help(b, i-1, j, idx+1, k, s);
        ans |= help(b, i, j-1, idx+1, k, s);
        ans |= help(b, i, j+1, idx+1, k, s);
        b[i][j] = c;
        return ans;
    }
}