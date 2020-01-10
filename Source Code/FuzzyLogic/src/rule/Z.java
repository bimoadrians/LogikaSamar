package rule;

public class Z {
	
	public static double Baik(double a) {
		return  100 - (a * 50);
	}
	
	public static double Sedang(double a) {
		return (200 - (a * 50)) + ((a*50) + 50);
	}
	
	public static double TidakSehat(double a) {
		return (a * 50) + 150;
	}
	
}
