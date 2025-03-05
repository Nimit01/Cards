// Card.java

class Card {
    private String rank;
    private String suit;

    // Constructor
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters
    public String getRank() { return rank; }
    public String getSuit() { return suit; }

    // Compare if two cards belong to the same suit
    public boolean sameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    // Compare if two cards have the same rank
    public boolean sameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    // Convert card to string format
    public String toString() {
        return rank + " of " + suit;
    }
}
