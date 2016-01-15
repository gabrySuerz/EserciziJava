
public class Salute {

	String calcoloIMC(Persona p) {
		double IMC = p.massa / (p.altezza * p.altezza);
		String classe = "";
		if (IMC < 18.5)
			classe = "sottopeso";
		else if (18.5 >= IMC && IMC < 25)
			classe = "normale";
		else if (25 >= IMC && IMC < 30)
			classe = "sovrappeso";
		else if (IMC >= 30)
			classe = "obeso";
		return classe;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona(1.85, 90);
		Salute s = new Salute();
		System.out.println(s.calcoloIMC(p1));
	}
}
