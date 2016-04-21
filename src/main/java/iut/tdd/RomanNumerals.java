package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {
		
		
		int nb=Integer.parseInt(arabe);
		
		String res="";
		for(int i=0;i<nb;i++){
		
				res=res+"I";
			}
		
		return res;
		
		
	
	}
	
	

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
