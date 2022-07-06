class Solution {
    public int fib(int N) {
	// easy base cases/edge cases
	if (N <= 1) {
		return N;            
	}

	// initialize our memoization map
	// size N +1 so that we can accomodate from 0 to N
	int[] map = new int[N+1];
	
	// put our base cases
	map[0] = 0;
	map[1] = 1;
	
	// iterate through remaining values (2...N)
	for (int i = 2; i <= N; i ++) {
		map[i] = map[i-1] + map[i-2];
	}
	return map[N];
}
}