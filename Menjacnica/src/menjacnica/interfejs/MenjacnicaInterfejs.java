package menjacnica.interfejs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String naziv, String skracenica, double prodajni, double srednji, double kupovni);

	public void obrisiKurs(String skracenica);

	public double pronadjiKurs(String skracenica);
}
