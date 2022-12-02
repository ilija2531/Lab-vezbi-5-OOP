package zadaca3;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> smer = new ArrayList<>();
		smer.add("INKI");
		smer.add("IKT");
		smer.add("KNI");
		
		smer.add(2, "SBMS");
		
		System.out.println("Smerovi: " + smer);
	}

}
