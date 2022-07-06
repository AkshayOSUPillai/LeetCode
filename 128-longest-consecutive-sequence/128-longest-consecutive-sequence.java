class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        //sets dont allow duplicate values
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            //add all the values to the set
            set.add(i);
        }
        for(int j : nums){
            //curent max is 1 because first element
            int max = 1;
            //previous/next value
            int prev = j-1;
            int next = j+1;
            
            while(set.contains(prev)){
                //check if it has it 
                max++;
                set.remove(prev);
                prev--;
            }
            while(set.contains(next)){ 
                max++;
                set.remove(next);
                next++;
            }
            length = Math.max(length,max);
        
        }
        return length;
            
        
            
        }
    }
