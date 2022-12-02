package zadaca2;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> drzavi = new ArrayList<>();
		drzavi.add("Makedonija");
		drzavi.add("Germanija");
		drzavi.add("Norveshka");
		drzavi.add("Srbija");
		
		System.out.println("Golemina na listata: " + drzavi.size());
		
		if (drzavi.size() == 3) {
			drzavi.add("Ungarija");
			drzavi.add("Kina");
			System.out.println("Drzavi: " + drzavi );
		}
		else
			System.out.println("Drzavi: " + drzavi );
	}

}
