package repository;

public class Input {
	public double co;
	public double so2;
	public double pm10;
	public double alpha;
	public double z;
	
	public Input(double co, double so, double pm10 ) {
		this.co = co;
		this.so2 = so;
		this.pm10 = pm10;
	}
	public Input(double co, double so, double pm10, double alpha) {
		this.co = co;
		this.so2 = so;
		this.pm10 = pm10;
		this.alpha = alpha;
	}
	public Input(double co, double so, double pm10, double alpha, double z) {
		this.co = co;
		this.so2 = so;
		this.pm10 = pm10;
		this.alpha = alpha;
		this.z = z;
	}
}
