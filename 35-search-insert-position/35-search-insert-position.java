class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int high = nums.length-1;
        int low = 0;
        int index = 0;
        
        while(low<=high){
            index = (high+low)/2;
            
            if(target>nums[index]){
                low = index+1;
            }
            else if(target<nums[index]){
                high = index-1;
                
            }
            else{
                return index;
            }
        }
        return low;
    }
}