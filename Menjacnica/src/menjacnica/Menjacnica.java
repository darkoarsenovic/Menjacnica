package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> menjacnica = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, String skracenica, double prodajni, double srednji, double kupovni) {
		try {
			Valuta v = new Valuta();
			v.setNaziv(naziv);
			v.setSkraceniNaziv(skracenica);
			v.setProdajniKurs(prodajni);
			v.setSrednjiKurs(srednji);
			v.setKupovniKurs(kupovni);

			menjacnica.add(v);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Override
	public void obrisiKurs(String skracenica) {
		for (int i = 0; i < menjacnica.size(); i++) {
			if (menjacnica.get(i).getSkraceniNaziv().equals(skracenica)) {
				menjacnica.remove(menjacnica.get(i));
			}
		}
	}

	@Override
	public double pronadjiKurs(String skracenica) {
		for (int i = 0; i < menjacnica.size(); i++) {
			if (menjacnica.get(i).getSkraceniNaziv().equals(skracenica)) {
				return menjacnica.get(i).getSrednjiKurs();
			}
		}
		return 0;
	}
}
