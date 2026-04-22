class Solution {
    public long minEnd(int n, int x) {
        
	long result = x;

		for(int i = 1; i < n; i++) {
			// with these formula we can do 
		    result = (result + 1) | x;
		}
return result;


    }
}