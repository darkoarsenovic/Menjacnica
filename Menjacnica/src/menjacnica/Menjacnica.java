package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> menjacnica = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(double prodajni, double srednji, double kupovni) {
		Valuta valuta = new Valuta();
		valuta.setProdajniKurs(prodajni);
		valuta.setSrednjiKurs(srednji);
		valuta.setKupovniKurs(kupovni);
		
		
		
		menjacnica.addLast(valuta);
	}

	@Override
	public void obrisiKurs() {
		// TODO Auto-generated method stub

	}

	@Override
	public double pronadjiKurs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
