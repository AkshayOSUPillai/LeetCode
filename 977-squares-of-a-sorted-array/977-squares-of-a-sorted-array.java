class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] b = new int[nums.length];
        Arrays.sort(nums);
        int j = 0;
        for(int i =nums.length-1; i>=0;i--){
            b[j] = nums[i]*nums[i];
            j++;
        }
        Arrays.sort(b);
        return b;
    }
}