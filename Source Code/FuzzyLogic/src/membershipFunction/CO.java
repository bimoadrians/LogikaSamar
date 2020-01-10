package membershipFunction;

public class CO {
	
	public static double lowCO(double x) {
		double hasil = 0;
		
		if(x >= 0 && x <= 5) {
			hasil =  1;
		}
		else if(x > 5 && x < 7) {
			hasil = (7 - x) / 2;
			
		}
		else if(x >= 7) {
			hasil = 0;
		}
		
		return hasil;
	}
	
	public static double midCO(double x) {
		double hasil = 0;
		
		if(x > 5 && x < 7) {
			hasil = (x - 5) / 2;
		}
		else if(x >= 7 && x <= 15) {
			hasil = 1;
		}
		else if(x > 15 && x < 17) {
			hasil = (15 - x) / 2;
		}
		else if( x >= 17) {
			hasil = 0;
		}
		
		return hasil;
	}
	
	public static double upCO(double x) {
		double hasil = 0;
		
		if(x > 15 && x < 17) {
			hasil =  (x - 20) / 20;
		}
		else if(x >= 17) {
			hasil = 1;
		}
		else if(x <= 15) {
			hasil = 0;
		}
		
		return hasil;
	}
}


