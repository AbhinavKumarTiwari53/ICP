class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int c=1, end=points[0][1];
        for(int i=0;i<points.length-1;i++){
            if(end>=points[i+1][0]) end=Math.min(end,points[i+1][1]);
            else {c++; end=points[i+1][1];}
        }
        return c;
    }
}