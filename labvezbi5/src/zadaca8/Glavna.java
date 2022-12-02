package zadaca8;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mejlovi = new ArrayList<>();
		for(int i=5;i<=20;i+=5) {
			mejlovi.add("mail" + i + "@yahoo.com");
		}
		System.out.println(mejlovi);
	}

}
