package zadaca9;

public class Fakultet {
	private String ime;
	private int brsmerovi;
	private int studenti;
	
	public Fakultet(String ime,int brsmerovi, int studenti) {
		this.setIme(ime);
		this.setBrsmerovi(brsmerovi);
		this.setStudenti(studenti);
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrsmerovi() {
		return brsmerovi;
	}

	public void setBrsmerovi(int brsmerovi) {
		this.brsmerovi = brsmerovi;
	}

	public int getStudenti() {
		return studenti;
	}

	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}
}
