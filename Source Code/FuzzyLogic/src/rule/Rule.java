package rule;

import java.util.LinkedList;
import repository.Function;
import repository.Input;

public class Rule {
	
	public static void Rules(LinkedList<Function> a) {
		LinkedList<Input> hasilRule = new LinkedList<Input>();
		
		System.out.println("\nHASIL PERHITUNGAN RULE");
		//co = 0 , so2 = 1, pm10 = 2
		
		//1
		hasilRule.add(new Input(a.get(0).low, a.get(1).low, a.get(2).low, 
			      Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).low)), 
				  Z.Baik(Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).low)))));
		//2
		hasilRule.add(new Input(a.get(0).low, a.get(1).low, a.get(2).mid, 
				  Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).mid)), 
				  Z.Baik(Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).mid)))));
		//3
		hasilRule.add(new Input(a.get(0).low, a.get(1).mid, a.get(2).low, 
				  Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).low)), 
				  Z.Baik(Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).low)))));
		//4
		hasilRule.add(new Input(a.get(0).low, a.get(1).mid, a.get(2).mid, 
				  Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).mid)), 
				  Z.Baik(Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).mid)))));
		//5
		hasilRule.add(new Input(a.get(0).mid, a.get(1).low, a.get(2).low, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).low)), 
				  Z.Baik(Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).low)))));
		//6
		hasilRule.add(new Input(a.get(0).low, a.get(1).low, a.get(2).up, 
				  Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).up)), 
				  Z.Sedang(Math.min(a.get(0).low, Math.min(a.get(1).low, a.get(2).up)))));
		//7
		hasilRule.add(new Input(a.get(0).low, a.get(1).up, a.get(2).low, 
				  Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).low)), 
				  Z.Sedang(Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).low)))));
		//8
		hasilRule.add(new Input(a.get(0).low, a.get(1).mid, a.get(2).up, 
				  Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).up)), 
				  Z.Sedang(Math.min(a.get(0).low, Math.min(a.get(1).mid, a.get(2).up)))));
		//9
		hasilRule.add(new Input(a.get(0).low, a.get(1).up, a.get(2).mid, 
				  Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).mid)), 
				  Z.Sedang(Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).mid)))));
		//10
		hasilRule.add(new Input(a.get(0).mid, a.get(1).low, a.get(2).mid, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).mid)), 
				  Z.Sedang(Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).mid)))));
		//11
		hasilRule.add(new Input(a.get(0).mid, a.get(1).low, a.get(2).up, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).up)), 
				  Z.Sedang(Math.min(a.get(0).mid, Math.min(a.get(1).low, a.get(2).up)))));
		//12
		hasilRule.add(new Input(a.get(0).mid, a.get(1).mid, a.get(2).low, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).low)), 
				  Z.Sedang(Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).low)))));
		//13
		hasilRule.add(new Input(a.get(0).mid, a.get(1).mid, a.get(2).mid, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).mid)), 
				  Z.Sedang(Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).mid)))));
		//14
		hasilRule.add(new Input(a.get(0).mid, a.get(1).up, a.get(2).low, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).low)), 
				  Z.Sedang(Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).low)))));
		//15
		hasilRule.add(new Input(a.get(0).up, a.get(1).low, a.get(2).low, 
				  Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).low)), 
				  Z.Sedang(Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).low)))));
		//16
		hasilRule.add(new Input(a.get(0).up, a.get(1).low, a.get(2).mid, 
				  Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).mid)), 
				  Z.Sedang(Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).mid)))));
		//17
		hasilRule.add(new Input(a.get(0).up, a.get(1).mid, a.get(2).low, 
				  Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).low)), 
				  Z.Sedang(Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).low)))));
		//18
		hasilRule.add(new Input(a.get(0).low, a.get(1).up, a.get(2).up, 
				  Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).low, Math.min(a.get(1).up, a.get(2).up)))));
		//19
		hasilRule.add(new Input(a.get(0).mid, a.get(1).mid, a.get(2).up, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).mid, Math.min(a.get(1).mid, a.get(2).up)))));
		//20
		hasilRule.add(new Input(a.get(0).mid, a.get(1).up, a.get(2).mid, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).mid)), 
				  Z.TidakSehat(Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).mid)))));
		//21
		hasilRule.add(new Input(a.get(0).mid, a.get(1).up, a.get(2).up, 
				  Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).mid, Math.min(a.get(1).up, a.get(2).up)))));
		//22
		hasilRule.add(new Input(a.get(0).up, a.get(1).low, a.get(2).up, 
				  Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).low, a.get(2).up)))));
		//23
		hasilRule.add(new Input(a.get(0).up, a.get(1).mid, a.get(2).mid, 
				  Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).mid)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).mid)))));
		//24
		hasilRule.add(new Input(a.get(0).up, a.get(1).mid, a.get(2).up, 
				  Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).mid, a.get(2).up)))));
		//25
		hasilRule.add(new Input(a.get(0).up, a.get(1).up, a.get(2).low, 
				  Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).low)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).low)))));
		//26
		hasilRule.add(new Input(a.get(0).up, a.get(1).up, a.get(2).mid, 
				  Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).mid)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).mid)))));
		//27
		hasilRule.add(new Input(a.get(0).up, a.get(1).up, a.get(2).up, 
				  Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).up)), 
				  Z.TidakSehat(Math.min(a.get(0).up, Math.min(a.get(1).up, a.get(2).up)))));
		
		hitungZ(hasilRule);
	}
	
	public static void hitungZ(LinkedList<Input> a) {
		double sumalphaZ = 0;
		double sumalpha = 0;
		double alphalvl2 = 0;
		double Z = 0;
		for (int i = 0 ; i < 27 ; i++) {
			sumalphaZ = sumalphaZ + (a.get(i).alpha * a.get(i).z);
			sumalpha = sumalpha + (a.get(i).alpha);
		}
		//6 - 17
		for(int i = 6; i <=17 ; i++) {
			alphalvl2 = alphalvl2 + (a.get(i).alpha);
		}
		
		System.out.println("SUM Alpha : " + sumalpha);
		System.out.println("SUM Alpha x z : " + sumalphaZ);
		System.out.println("Alpha lvl2 : " + alphalvl2);
		
		//HASIL Z
		Z = sumalphaZ / (sumalpha + alphalvl2) ;
		System.out.println(Z);
		
		Decision.decision(Z, a);
		
	}
	
}
