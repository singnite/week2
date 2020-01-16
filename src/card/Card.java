package card;

/**
 * This class +++Insert Description Here+++
 * @author nites
 */
public class Card {

    private String suit; // clubs, spades, ...,....
    private int value; //1-13
      
      private String[] SUITS = {"Hearts","Diamonds", "Spades", "Clubs"};

      
      // FOr encapsulation - use Refractor - Encapslation
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the SUITS
     */
    public String[] getSUITS() {
        return SUITS;
    }

    /**
     * @param SUITS the SUITS to set
     */
    public void setSUITS(String[] SUITS) {
        this.SUITS = SUITS;
    }
   

      }
         
     
    

