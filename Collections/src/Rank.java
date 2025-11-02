/**
 * This is rank used for PictureFrame
 */
enum Rank {
    ACE ("A",1),
    TWO ("2",2),
    THREE ("3",3),
    FOUR ("4",4),
    FIVE ("5",5),
    SIX ("6",6),
    SEVEN ("7",7),
    EIGHT ("8",8),
    NINE ("9",9),
    TEN ("10",10),
    JACK ("J",10),
    QUEEN ("Q",10),
    KING ("K",10);

    private String str;
    private int rank;

    Rank(String str, int rank) {
        this.str = str;
        this.rank = rank;
    }

    public String getRank() { return str; }

    public int getValue() { return rank; }

    @Override
    public String toString() { return this.name();  }

    public static void main(String[] args) {
        for (Rank rank : Rank.values()) {
            System.out.println("Suit: " + rank +
                    " Abbrev: " + rank.getRank() +
                    " Value: " + rank.getValue());
        }

        System.out.println(Rank.ACE.compareTo(Rank.JACK));
    }
}
