import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    Deck(){
        for (Suit suit : Suit.values()) {
            for( Rank rank : Rank.values()) {
                deck.add(new Card(rank,suit));
            }
        }
    }

    public void shuffle() {
       Collections.shuffle(deck);
    }

    public static void main(String[] args) {
        Deck d = new Deck();

        for( Card c : d.deck)
            System.out.println(c);

        d.shuffle();
        System.out.println("After shuffle");
        for( Card c : d.deck)
            System.out.println(c);
    }
}
