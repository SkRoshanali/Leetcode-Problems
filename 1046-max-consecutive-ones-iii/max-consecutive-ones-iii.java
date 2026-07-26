class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,z=0,m=0,n=nums.length;
        while(r<n){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0)
                    z--;
                l++;
            }
            m = Math.max(m,r-l+1);
            r++;
        }
    return m;
    }
}