class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] demo = arr.clone();
        Arrays.sort(demo);
        Map<Integer,Integer> lol = new HashMap<>();
        int r=1;
        for(int i:demo){
            if(!lol.containsKey(i)){
                lol.put(i,r);
                r++;
            }
        }
        int[] res = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            res[i] = lol.get(arr[i]);
        }
    return res;
    }
}