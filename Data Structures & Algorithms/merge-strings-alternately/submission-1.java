class Solution {
    public String mergeAlternately(String s1, String s2) {
        


				char ch[] = new char[s1.length()+s2.length()];
				
			int	index1=0;
					int	index2=0;
				
				for (int i = 0; i < ch.length; ) {
					
					if(index1<s1.length())
					ch[i++]=s1.charAt(index1++);
					if(index2<s2.length())
					ch[i++]=s2.charAt(index2++);
					
					
				}


				String ss= new String(ch);

return ss;

    }
}