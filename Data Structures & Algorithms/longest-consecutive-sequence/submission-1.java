class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int ml = 1;
        int cl = 1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1){
                cl++;
            }
            else cl =1;
        ml = Math.max(ml,cl);
        }
        return ml;
    }
}
