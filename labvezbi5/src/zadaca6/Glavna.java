package zadaca6;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mejl = new ArrayList<>();
	
		for(int i=1;i<=20;i++) {
			mejl.add("mail" + i + "@yahoo.com");
		}
		
		System.out.println(mejl);
	}

}
