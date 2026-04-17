class Solution {
    public boolean isPalindrome(String s) {
        

s=s.toLowerCase();
		
String temp="";		
String temp2="";		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0' && s.charAt(i)<='9' ) {
				temp=(s.charAt(i))+temp;
				temp2+=(s.charAt(i));
			}
			
			
		}
	
		
		return temp2.equals(temp);

    }
}
