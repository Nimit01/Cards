# Card Deck Management System

## Overview
This Java program implements a **menu-driven deck management system** that allows users to interact with a deck of 52 playing cards. The program uses **ArrayList** for card storage and includes operations like creating, printing, comparing, searching, dealing, and shuffling cards.

## Features
- **Create and Print a Deck of Cards**
- **Print a Specific Card** by index
- **Compare Two Cards** (Same Suit or Same Rank)
- **Search for a Specific Card**
- **Deal 5 Random Cards**
- **Shuffle the Deck**
- **User-friendly Menu-driven Interface**

## File Structure
- **`Card.java`**: Defines the `Card` class with attributes (rank and suit), comparison methods, and string representation.
- **`Deck.java`**: Implements the deck and provides operations like shuffle, search, compare, deal, and print.
- **`Main.java`**: Implements a menu-driven program for user interaction.

## How to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/Card_Deck.git
   cd Card_Deck
   ```
2. **Compile the Java files**
   ```bash
   javac Main.java Card.java Deck.java
   ```
3. **Run the program**
   ```bash
   java Main
   ```

## Exception Handling
This program includes input validation to handle incorrect inputs gracefully.
- **Handles invalid numeric inputs** in menu selection.
- **Checks for valid card indices** before performing operations.
- **Ensures correct rank and suit format** during searches.

## Sample Output
```
1. Print Deck
2. Print a Card
3. Compare Two Cards (Same Suit)
4. Compare Two Cards (Same Rank)
5. Find a Card
6. Deal 5 Random Cards
7. Shuffle Deck
8. Exit
Enter your choice:
```

## GitHub Commit Guidelines
- **Each file should have a separate commit**
- **Each function should be committed separately**
- **Commit Messages:**
  - `Added Card class with attributes and comparison methods`
  - `Implemented deck creation and operations in Deck.java`
  - `Created menu-driven program in Main.java`
  - `Added validation checks and exception handling`

## Author
- **Name**: [Nimit Prakash]

