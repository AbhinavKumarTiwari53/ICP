class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        help(ans, new ArrayList<Integer>(),1,n,k);
        return ans;
    }
    void help(List<List<Integer>> ans, List<Integer> p, int i, int n, int k){
        if(k==0) {ans.add(new ArrayList<Integer>(p)); return;}
        for(int j=i; j<=n;j++){
            p.add(j);
            help(ans, p, j+1, n, k-1);
            p.remove(p.size()-1);
        }
    }
}