enum Suit {
    CLUBS ("C"), DIAMONDS ("D"), HEARTS("H"), SPADES("S");

    private String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() { return suit; }


    @Override
    public String toString() { return this.name();  }

    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
               System.out.println("Suit: " + suit + " Abbrev: " + suit.getSuit());
        }

        System.out.println(Suit.DIAMONDS.compareTo(Suit.HEARTS));
        System.out.println(Suit.DIAMONDS.compareTo(Suit.DIAMONDS));
        System.out.println(Suit.DIAMONDS.compareTo(Suit.CLUBS));
    }
}
