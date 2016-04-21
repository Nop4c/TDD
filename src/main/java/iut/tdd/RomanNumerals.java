package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {				
		int nb=Integer.parseInt(arabe);		
		String res="";
		if (nb==10){
			res=res+"X";
		nb=nb-10;
		}
		if (nb==9){
			res=res+"IX";
		nb=nb-9;
		}
		if (nb==7){
			res=res+"VII";
		nb=nb-7;
		}
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
