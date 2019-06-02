package org.formacion;

public class Utilidad {

	public int round (double d) {
		int intPart = (int) d;
		
		double decPart = d - intPart;
		
		if (decPart < 0.5) {
			return intPart;
		} else {
			return intPart + 1;
		}
	}
}
