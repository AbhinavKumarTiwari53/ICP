class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a,b)->a[1]-b[1]);
        int c=0;
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(end>arr[i][0]) c++;
            else end=arr[i][1];
        }
        return c;
    }
}