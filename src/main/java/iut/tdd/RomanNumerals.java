package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {				
		int nb=Integer.parseInt(arabe);	
		String res="";
		
		/*if(nb>9 && nb<20){
			res=res+"X";	*/	
		int r=nb%10;
	
		if (r==9){
			res=res+"IX";
			nb=nb-9;
			
		}
		if (r==8){
			res=res+"VIII";
			nb=nb-8;
			
		}
		if (r==7){
			res=res+"VII";
			nb=nb-7;
			
		}
		if (r==6){
			res=res+"VI";
			nb=nb-6;
			
		}
		if (r==5){
			res=res+"V";
			nb=nb-5;
			
		}
		if (r==4){
			res=res+"IV";
			nb=nb-4;
		
		}
		
		if (r==3){
			res=res+"III";
			nb=nb-3;
			

		}
		if(r==2){
			res=res+"II";
			nb=nb-2;
		}
	
		if(r==1){
			res+="I";
			nb=nb-1;
			}
		//}
		if(nb>9 && nb<20){
			res="X"+res;
			
		}
		if(nb>19 && nb<30){
			res="XX"+res;
		}
		if(nb>29 && nb<40){
			res="XXX"+res;
			
		}
		
	
		return res;
	}
	
	/*
	
	int nb=Integer.parseInt(arabe);	
	
	
	String res="";
	if (nb==30){
		res=res+"XXX";
	nb=nb-30;
	}
	if (nb==29){
		res=res+"XXIV";
	nb=nb-29;
	}
	if (nb==28){
		res=res+"XXVIII";
	nb=nb-28;
	}
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

*/



	
	
	
	
	
	
	
	
	
	
	
	
	

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
