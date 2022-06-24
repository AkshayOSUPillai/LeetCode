class Solution {
    
        public int maxSubArray(int[] nums) {

	int maxsum = Integer.MIN_VALUE;
	int currsum = 0;

	for (int n : nums) {

		currsum += n;
		maxsum = Math.max(currsum, maxsum);

		if (currsum < 0)
			currsum = 0;
	}

	return maxsum;        
}
    
}