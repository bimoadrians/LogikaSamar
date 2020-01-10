package rule;

import java.util.LinkedList;
import main.Sistem;

import repository.Input;


public class Decision {
	
	public static void decision(Double z, LinkedList<Input> a) {
		
		if ( z <= 100){
			System.out.println("BAIK : " + z );
			Sistem.hasil = "BAIK";
			Sistem.z = String.format("%.2f", z);
			
			//popup.tablehasil("LEVEL 3", z);
		}
		else if (z > 100 && z < 200) {
			System.out.println("SEDANG : " + z );
			Sistem.hasil = "SEDANG";
			Sistem.z = String.format("%.2f", z);
//			popup.tablehasil("LEVEL 2", z);
		}
		else if (z >= 200 && z <= 300) {
			System.out.println("TIDAK SEHAT : " + z );
			Sistem.hasil = "TIDAK SEHAT";
			Sistem.z = String.format("%.2f", z);
	//		popup.tablehasil("LEVEL 1", z);
		}
}
}
