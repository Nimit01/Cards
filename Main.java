// Main.java

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Compare Two Cards (Same Suit)");
            System.out.println("4. Compare Two Cards (Same Rank)");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;

                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = sc.nextInt();
                    deck.printCard(index);
                    break;

                case 3:
                    System.out.print("Enter first card index: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter second card index: ");
                    int index2 = sc.nextInt();
                    deck.sameCard(index1, index2);
                    break;

                case 4:
                    System.out.print("Enter first card index: ");
                    index1 = sc.nextInt();
                    System.out.print("Enter second card index: ");
                    index2 = sc.nextInt();
                    deck.compareCard(index1, index2);
                    break;

                case 5:
                    System.out.print("Enter rank (e.g., 2, 3, J, Q, A): ");
                    String rank = sc.next();
                    System.out.print("Enter suit (Hearts, Clubs, Diamonds, Spades): ");
                    String suit = sc.next();
                    deck.findCard(rank, suit);
                    break;

                case 6:
                    deck.dealCard();
                    break;

                case 7:
                    deck.shuffleDeck();
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
