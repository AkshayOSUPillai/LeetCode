class Solution {
    public int search(int[] nums, int target) {
        
        int index = 0;
        int length = nums.length-1;
        int flag = 0;
        while(flag<=length){
           index = (flag +length)/2;
            if(nums[index]==target){
                return index;
                
            }
            else if(nums[index]>target){
              length = index-1;  
            }
            else{
               flag = index+1; 
            }
                
}
        return -1;
    }
}