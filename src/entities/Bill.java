package entities;

public class Bill {
	
	public char gender;
	public  int beer ;
	public  int barbecue ;
	public  int softDrink ;

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public  double cover() {
		
		if(feeding() > 30) {
			
			return 0.0;
			
		}else {
			
			return 4.0;
		}
	}
	
	public  double feeding() {
		
		return beer * 5 + barbecue * 7 + softDrink * 3;
	}
	
	public  double ticket() {
		
		if (gender == 'F') {
			
			return 8.0;
			
		}else{
			
			return 10.0;
		}
	}
	
	public  double total() {
		
		return cover() + feeding() + ticket();
	}

}
