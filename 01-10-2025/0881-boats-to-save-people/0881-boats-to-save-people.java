class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        while(l <= r){
            int sum = people[l] + people[r];
            if(sum <= limit){
                c++;
                l++;
                r--;
            }
            else{
                c++;
                r--;
            }
        }
        return c;
    }
}