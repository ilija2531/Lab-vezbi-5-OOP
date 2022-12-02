package zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> drzavi = new ArrayList<>();
		drzavi.add("Makedonija");
		drzavi.add("Srbija");
		drzavi.add("Hrvatska");
		
		List<String> drzavi2 = new ArrayList<>();
		drzavi2.add("Ungarija");
		drzavi2.add("Makedonija");
		drzavi2.add("Srbija");
		
		drzavi.retainAll(drzavi2);
		
		System.out.println(drzavi);

	}

}
