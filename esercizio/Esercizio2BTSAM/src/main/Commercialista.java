package main;

/**
 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
 * vengono considerati le parcelle di eventuali clienti duplicati).
 * 
 * @return il totale delle parcelle
 */
/**
 * Inserisce un nuovo cliente, verificando che non sia già stato inserito.
 * 
 * @param d
 *            dipendente
 */
/**
 * Restituisce il numero di volte che all'atto dell'inserimento di un
 * cliente, il cliente era già stato inserito.
 * 
 * @return
 */
/**
 * Dato un cliente, restituisce il numero di volte che lo stesso cliente è
 * stato inserito tramite le funzione addCliente. Nel caso che un dato
 * cliente sia stato inserito una sola volta, restituisce il valore 1.
 * 
 * @param d
 *            cliente da verificare
 * @return numero di ripetizioni.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {

	List<Cliente> clienti = new ArrayList<>();
	Cliente[] clients;
	Map<Cliente, Integer> clientiIns = new HashMap<>();

	public int totaleParcelle() {
		int tot = 0;
		for (Cliente l : clienti) {
			tot += l.getParcellaBase();
		}
		return tot;
	}

	public void addCliente(Cliente d) {
		if (clientiIns.containsKey(d)) {
			Integer cl = clientiIns.get(d);
			cl += 1;
		} else {
			clientiIns.put(d, 1);
			// System.out.println(clientiIns.keySet().toString());
		}
		/*
		 * boolean agg=true; for (Cliente c : clienti) { if (d.equals(c)) agg =
		 * true; else { agg = false; break; } } if (agg == true) clienti.add(d);
		 */
	}

	public int clientiDuplicati() {
		Integer cl = 0;
		for (Cliente in : clienti) {
			if (clientiIns.containsKey(in)) {
				cl += clientiIns.get(in) - 1;
			}
		}
		return cl;
	}

	public Integer numeroRipetizioni(Cliente d) {
		if (clientiIns.containsKey(d)) {
			Integer cl = clientiIns.get(d);
			return cl;
		} else {
			return 0;
		}
	}

}
