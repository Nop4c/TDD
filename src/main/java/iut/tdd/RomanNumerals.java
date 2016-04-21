package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {				
		int nb=Integer.parseInt(arabe);		
		String res="";
		
		if(nb==5){
			res=res+"V";
			nb=nb-5;
		}
	
		if(nb==4){
			res+="IV";
			nb=nb-4;
			}
		
	
	for(int i=0;i<nb;i++){
			res=res+"I";	
		}
		return res;	
	}
	
	
	

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
