class Solution {
public boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
int l=nums.length;
for(int i=1;i<l;i++){
if(nums[i-1]==nums[i]) return true;
}
return false;
}
}