package zadaca10;

import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> drzavi = new ArrayList<>();
		drzavi.add("Makedonija");
		drzavi.add("Srbija");
		drzavi.add("Hrvatska");
		
		List<String> gradovi = new ArrayList<>();
		gradovi.add("Skopje");
		gradovi.add("Belgrad");
		gradovi.add("Zagreb");
		
		drzavi.addAll(gradovi);
		
		System.out.println(drzavi);
	}

}
