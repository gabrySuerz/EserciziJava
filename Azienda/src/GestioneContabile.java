
public class GestioneContabile {

	int conteggioStipendio(Azienda a) {
		int somma = 0;
		for (Dipendente d : a.elencodipendenti) {
			somma = (somma + d.contratto.stipendioBase
					+ (int) (((d.contratto.stipendioBase) * 0.5 / 100) * d.anzianita));
		}
		return somma;
	}

	int conteggioStipendioMax(Azienda a) {
		int somma = 0;
		for (Dipendente d : a.elencodipendenti) {
			if (d.contratto.stipendioBase > somma)
				somma = d.contratto.stipendioBase;
		}
		return somma;
	}

	public static void main(String[] args) {

		Contratto c1 = new Contratto("AD", 300000);
		Contratto c2 = new Contratto("Direttore", 220000);
		Contratto c3 = new Contratto("Dipendente", 180000);
		Dipendente d1 = new Dipendente("AD", "", 12, c1);
		Dipendente d2 = new Dipendente("Direttore", "", 6, c2);
		Dipendente d3 = new Dipendente("Dipendente", "", 2, c3);
		Azienda a1 = new Azienda("", new Dipendente[] { d1, d2, d3 });
		GestioneContabile g = new GestioneContabile();
		System.out.println(g.conteggioStipendio(a1));
		System.out.println(g.conteggioStipendioMax(a1));

	}

}
