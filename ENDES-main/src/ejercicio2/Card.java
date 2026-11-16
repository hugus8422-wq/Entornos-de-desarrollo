package ejercicio2;

public class Card {
	// El palo de la carta
	public String suit;
	// El valor de la carta
	public String value;

	// Crea una carta con el palo y el valor que le demos
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	// Devuelve la carta como texto, por ejemplo: Spades-Ace
	public String toString() {
		return (this.suit + "-" + this.value);
	}
}
