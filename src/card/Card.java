package card;

/**
 * This class +++Insert Description Here+++
 *
 * @author nites
 */
import java.util.*;

public class Card {

    private String suit; // Clubs, spades, diamonds, hearts.
    
    private int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; //1-13

    private String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    // Method for printintg card calculation
    public void showCard()
    {
        for(int i = 0; i<SUITS.length;i++)
        {
            for(int j =0;j<value.length;j++)
            {
                Syste.out.println(SUITS[i] + value[j]); 
            }
        }
    }
    
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
    public int[] getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int[] value) {
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
