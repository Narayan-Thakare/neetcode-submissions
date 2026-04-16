class Solution {
    public boolean isAnagram(String s1, String s2) {


if(s1.length()!=s2.length()) 
			return false;
		
		
		int ar[] = new int [256];
		
		for (int i = 0; i < s1.length(); i++) {
			
			ar[s1.charAt(i)-48]++;
			ar[s2.charAt(i)-48]--;
			
		}
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]!=0) {
				return false;
			}
		}
		
return true;
    }
}
