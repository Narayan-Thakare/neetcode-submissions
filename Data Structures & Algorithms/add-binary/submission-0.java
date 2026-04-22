class Solution {
    public String addBinary(String s1, String s2) {
        

      int i = s1.length()-1;
		int j = s2.length()-1;
		
		String  temp = "";
		int carry =0 ;
		while(i>=0 || j>=0 || carry!=0 ) {
			
			int num1 = i>=0 ?s1.charAt(i)-48: 0  ;
			int num2 = j>=0?s2.charAt(j)-48 : 0 ;
			
			
			int ans = num1+num2+carry ;
			
			temp = (ans%2) +temp;
			carry = ans/2;
			i--;
			j--;
		}

    return temp;



    }
}