// Deck.java

import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    // Constructor initializes an empty deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Prints all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Prints a single card at a given index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }

    // Checks if two cards belong to the same suit
    public void sameCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);
            System.out.println(card1 + " and " + card2 + " are " + (card1.sameSuit(card2) ? "from the same suit." : "from different suits."));
        } else {
            System.out.println("Invalid card indices!");
        }
    }

    // Checks if two cards have the same rank
    public void compareCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);
            System.out.println(card1 + " and " + card2 + " are " + (card1.sameRank(card2) ? "of the same rank." : "of different ranks."));
        } else {
            System.out.println("Invalid card indices!");
        }
    }

    // Searches for a particular card in the deck
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card Found: " + card);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    // Deals 5 random cards
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Shuffles the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
}
