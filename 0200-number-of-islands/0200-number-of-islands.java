class Solution {
    public int numIslands(char[][] grid) {
        int c=0; int n=grid.length, m=grid[0].length;
        int[][] a={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    c++;
                    clear(grid,i,j,a,n,m);
                }
            }
        }
        return c;
    }
    void clear(char[][] grid,int r,int c,int[][] a,int n,int m){
        if(r<0 ||  r>=n || c>=m || c<0 || grid[r][c]=='0') return;
        grid[r][c] = '0';
        for(int i[]:a){
            clear(grid,r+i[0],c+i[1],a,n,m);
        }
    }   
}
