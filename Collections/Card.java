public class Card {
    Rank rank;
    Suit suit;

    Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Card card = new Card(Rank.ACE, Suit.CLUBS);

        System.out.println(card);
    }
}
