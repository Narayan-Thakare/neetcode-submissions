class Solution {

    static  String rev(String s) {
		String temp = "";

		for (int i = 0; i < s.length(); i++)temp=s.charAt(i)+temp; 

		return temp;
	}
    public boolean validPalindrome(String s) {
        
	if(s.equals(rev(s))){
        return true;
    }
		
		
		if(!s.equals(rev(s))) {
			
	
	for(int j = 0 ; j<s.length();j++) {
		String temp="";		
		for(int i =0; i<s.length();i++ ) {
			
			if(i!=j)
			temp+=s.charAt(i);
		}
	
		
		if(temp.equals(rev(temp))) {
			return true;
		}
			
		
	}
			
		}

			return false;

    }
}