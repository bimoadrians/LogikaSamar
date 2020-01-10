package membershipFunction;

public class PM10 {
	public static double lowPM10(double x) {
		double hasil = 0;
		
		if(x >= 0 && x <= 50) {
			hasil =  1;
		}
		else if(x > 50 && x < 120) {
			hasil = (120 - x) / 70;
		}
		else if(x >= 120 ) {
			hasil = 0;
		}
		
		return hasil;
	}
	
	public static double midPM10(double x) {
		double hasil = 0;
		
		if(x > 50 && x < 120) {
			hasil = (x - 50) / 70;
		}
		else if(x >= 120 && x <=350) {
			hasil = 1;
		}
		else if(x > 350 && x < 370) {
			hasil = (370 - x) / 20;
		}
		else if( x >= 370) {
			hasil = 0;
		}
		
		
		return hasil;
	}
	
	public static double upPM10(double x) {
		double hasil = 0;
		
		if(x > 350 && x < 370) {
			hasil =  (x - 350) / 20;
		}
		else if(x >= 370) {
			hasil = 1;
		}
		else if(x <= 350) {
			hasil = 0;
		}
		
		return hasil;
	}
}

