class Solution {
    public int minCost(String colors, int[] neededTime) {
        if (neededTime.length < 2) return 0;    
		int t = 0;
		for(int i = 1; i < neededTime.length; i++) {
			if(colors.charAt(i - 1) == colors.charAt(i)) {
				t += Math.min(neededTime[i - 1], neededTime[i]);	 
				if(neededTime[i] < neededTime[i - 1]) neededTime[i] = neededTime[i - 1];
			}
		}
		return t;
    }
}
