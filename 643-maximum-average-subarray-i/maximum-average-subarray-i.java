class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int m = 0;
        int n = nums.length;
        int l =0,r=0;
        for(int i=0;i<k;i++){
            m += nums[i];
        }
        int lol = m;
        for(int i=k;i<n;i++){
            m += nums[i] - nums[i-k];
            lol = Math.max(lol,m);
        }
        
        return (double)lol/k;
    }
}