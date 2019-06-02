package simple;

import org.apache.commons.math3.primes.Primes;

public class Utilidad {

	public int siguientePrimo(int numero) {
		return Primes.nextPrime(numero);
	}
	
	public boolean esPrimo (int numero) {
		return Primes.isPrime(numero);
	}
}
