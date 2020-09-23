package cambiaMonete;

public class cambiaMonete {

	int banc=200;
	
	String calcoloBanconote(int somma) {
		String acc = "";
		while (somma >= 1) {
			if (somma >= 500) {
				somma -= 500;
				acc += "500 ";
			} else if (somma >= 200 && somma < 500) {
				somma -= 200;
				acc += "200 ";
			} else if (somma >= 100 && somma < 200) {
				somma -= 100;
				acc += "100 ";
			} else if (somma >= 50 && somma < 100) {
				somma -= 50;
				acc += "50 ";
			} else if (somma >= 20 && somma < 50) {
				somma -= 20;
				acc += "20 ";
			} else if (somma >= 10 && somma < 20) {
				somma -= 10;
				acc += "10 ";
			} else if (somma > 5 && somma < 10) {
				somma -= 5;
				acc += "5 ";
			} else if (somma >= 2 && somma < 5) {
				somma -= 2;
				acc += "2 ";
			} else if (somma >= 1 && somma < 2) {
				somma -= 1;
				acc += "1 ";
			} else if (somma < 1) {
				somma = 0;
				acc += "";
			}
		}
		return acc;
	}

	public static void main(String[] args) {
		cambiaMonete c1 = new cambiaMonete();
		System.out.println(c1.calcoloBanconote(961));
	}

}
