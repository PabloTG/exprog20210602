package fp.daw.exprog20210602.ejercicio3;

import java.lang.IllegalArgumentException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {
	public static void invertir(int n, Queue<Integer> q) throws IllegalArgumentException {
		if (n > 0) { // sólo se hará algo si n no es negativo ni cero
			if (q == null || q.size() < n)
				// si no hay suficientes elementos en q, lanzo una excepción
				throw new IllegalArgumentException();
			else {
				// declaro un entero auxiliar y una cola auxiliar
				int m = q.size() - n;
				Deque<Integer> p = new LinkedList<Integer>();
				// añado los n primeros enteros de q a p
				do {
					p.push(q.poll());
					n--;
				} while (n > 0);
				// añado los n enteros de p a q
				while (p.peek() != null)
					q.add(p.pop());
				// mando los elementos del frente de q a la cola de q hasta haberle dado la
				// vuelta
				do {
					q.add(q.poll());
					m--;
				} while (m > 0);
			} // fin else q
		} // fin if
	} // fin invertir

	// para comprobar el funcionamiento de invertir (ejemplo del enunciado)
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		int[] numeros = { 2, 13, -42, 21, 4, 9, 14, -3, 11, 5 };
		for (int n : numeros)
			q.add(n);
		try {
			invertir(4, q);
		} catch (IllegalArgumentException iae) {
			System.err.println("La cola no contiene suficientes elementos.");
		}
		System.out.println(q);
	} // fin main
} // fin clase
