class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int left = 0;
        int right = nums.length-1; 
        int cnt = 0;
        Arrays.sort(nums);

        while(left < right) {
            int s = nums[left] + nums[right];
            if(k == s) {
                left++;
                right--;
                cnt++;
            }else {
                if(nums[left] + nums[right] < k) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        return cnt;
    }
}