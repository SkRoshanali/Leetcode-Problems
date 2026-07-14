class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] arr = new int[n*2];
        int j = 0;
        for(int i = 0;i<n*2;i++){
            if(j==n) j = 0;
            arr[i] = nums[j];
            j++;
        }
        return arr;
    }
}