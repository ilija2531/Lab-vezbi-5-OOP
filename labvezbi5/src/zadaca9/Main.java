package zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fakultet> fakulteti = new ArrayList<Fakultet>();
		
		Fakultet fakultet1 = new Fakultet("FIKT",2,200);
		fakulteti.add(fakultet1);
		Fakultet fakultet2 = new Fakultet("PFB",4,250);
		fakulteti.add(fakultet2);
		Fakultet fakultet3 = new Fakultet("FINKI",3,500);
		fakulteti.add(fakultet3);
		Fakultet fakultet4 = new Fakultet("EF-Prilep",4,300);
		fakulteti.add(fakultet4);
		Fakultet fakultet5 = new Fakultet("TFB",2,250);
		fakulteti.add(fakultet5);
		
		for(int i=0;i<=fakulteti.size();i++) {
			System.out.println("Fakultet: " + fakulteti.get(i).getIme());
			System.out.println("Broj na smerovi: " + fakulteti.get(i).getBrsmerovi());
			System.out.println("Broj na studenti: " +fakulteti.get(i).getStudenti());
		}
	}

}
