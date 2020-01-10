package membershipFunction;

import java.util.LinkedList;
import repository.Function;
import rule.Rule;

public class Value {
	public static void value(double co, double so2, double pm10){
		
		LinkedList<Function> value = new LinkedList<Function>();
		
		double lco = CO.lowCO(co);
		double mco = CO.midCO(co);
		double uco = CO.upCO(co);
		
		double lso2 = SO2.lowSO2(so2);
		double mso2 = SO2.midSO2(so2);
		double uso2 = SO2.highSO2(so2);
		
		double lpm10 = PM10.lowPM10(pm10);
		double mpm10 = PM10.midPM10(pm10);
		double upm10 = PM10.upPM10(pm10);
		
		//index ke 0 = Intensitas
		//index ke 1 = Tinggi Muka Air
		//index ke 2 = Penampang
		
		value.add(new Function(lco, mco, uco));
		value.add(new Function(lso2, mso2, uso2));
		value.add(new Function(lpm10, mpm10, upm10));
		
		System.out.println("Hasil Perhitungan Variable");
		System.out.println("                        kiri\ttengah\tkanan");
		System.out.println("CO \t : \t" + value.get(0).low + "\t" + value.get(0).mid + "\t" + value.get(0).up);
		System.out.println("SO2 \t : \t" +value.get(1).low + "\t" + value.get(1).mid + "\t" + value.get(1).up);
		System.out.println("PM10 \t : \t" +value.get(2).low + "\t" + value.get(2).mid + "\t" + value.get(2).up);
		
		
		Rule.Rules(value);
		
		
		
	}
}
