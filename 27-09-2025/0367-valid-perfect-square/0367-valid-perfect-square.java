class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        int i = 2;
        int j = num / 2;
        while (i <= j) {
            int m = i + (j - i) / 2;
            long sq = (long) m * m;
            if (sq == num)
                return true;
            if (sq > num)
                j = m - 1;
            else
                i = m + 1;
        }
        return false;
    }
}
