package ejercicio2;

import java.util.ArrayList;

//Programa que crea una baraja, la mezcla y reparte 5 cartas
public class DeckCards {

	public static void main(String[] args) {
		// Los 4 palos y los 13 valores posibles

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		// Lista vacía donde guardaremos las cartas

		ArrayList<Card> deck = new ArrayList<Card>();

		// Crea las 52 cartas: cada palo con cada valor
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		// Mezcla la baraja: cambia cada carta de sitio con otra elegida al azar
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		// Muestra las 5 primeras cartas de la baraja mezclada
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
