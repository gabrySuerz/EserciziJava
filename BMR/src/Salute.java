
public class Salute {

	public double calcoloBMR(Persona p) {
		double MB = 0;
		if (p.sesso == 'm')
			MB = 655 + (13.8 * p.peso) + (1.8 * p.altezza) - (4.7 * p.eta);
		if (p.sesso == 'f')
			MB = 655 + (9.6 * p.peso) + (1.8 * p.altezza) - (4.7 * p.eta);
		if (p.attivitaf == "sedentario")
			MB = MB + (MB * 20) / 100;
		if (p.attivitaf == "moderatamente attivo")
			MB = MB + (MB * 30) / 100;
		if (p.attivitaf == "attivo")
			MB = MB + (MB * 40) / 100;
		if (p.attivitaf == "molto attivo")
			MB = MB + (MB * 50) / 100;
		return MB;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona(180, 90, 25, 'm', "molto attivo");
		Salute s = new Salute();
		System.out.println(s.calcoloBMR(p1));
	}

}
