package zadaca4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> broevi = new ArrayList<>();
			broevi.add(40);
			broevi.add(23);
			broevi.add(19);
			broevi.add(214);
			broevi.add(5);
			
			Collections.sort(broevi);
			
			System.out.println("Broevi: " + broevi);
	}

}
