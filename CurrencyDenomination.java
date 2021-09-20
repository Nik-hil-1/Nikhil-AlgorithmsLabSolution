package com.gl.lab.currencydenomination;

public class CurrencyDenomination {

	public void noteCounter(int[] notes, int amount) {

		int[] noteCounter = new int[notes.length];

		try {

			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}

			if (amount > 0)
				System.out.println("Exact amount denomination is not available");
			else {
				System.out.println("\nYour payment approach in order to give minimum notes is :- ");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0)
						System.out.println(notes[i] + " : " + noteCounter[i]);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}

}
