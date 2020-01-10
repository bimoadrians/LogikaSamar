package membershipFunction;

public class SO2 {
	public static double lowSO2(double x) {
		double hasil = 0;
		
		if(x >= 0 && x <= 80) {
			hasil =  1;
		}
		else if(x > 80 && x < 125) {
			hasil = (125 - x) / 45;
		}
		else if(x >= 125) {
			hasil = 0;
		}
		
		return hasil;
	}
	
	public static double midSO2(double x) {
		double hasil = 0;
		
		if(x > 80 && x < 125) {
			hasil = (x - 80) / 45;
		}
		else if(x >= 125 && x <=750) {
			hasil = 1;
		}
		else if(x > 750 && x < 800) {
			hasil = (800 - x) / 50;
		}
		else if( x <= 80 && x >= 800) {
			hasil = 0;
		}
		
		return hasil;
	}
	
	public static double highSO2(double x) {
		double hasil = 0;
		
		if(x > 750 && x < 800) {
			hasil =  (x - 750) / 50;
		}
		else if(x >= 800) {
			hasil = 1;
		}
		else if(x <= 750) {
			hasil = 0;
		}
		
		return hasil;
	}
}

