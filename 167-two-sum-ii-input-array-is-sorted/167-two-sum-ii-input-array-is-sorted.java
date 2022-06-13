class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int first = 0;
        int last = numbers.length-1;
        
        
        while(first<last){
            
            int tempF = numbers[first];
            int tempL = numbers[last];
            
            if(tempF+tempL == target){
                result[0] = first+1;
                result[1] = last+1;
                break;
            }
            else if(tempF+tempL< target ){
               first++; 
            }
            else{
                last--;
            }
            
        }
        return result;
    }
}