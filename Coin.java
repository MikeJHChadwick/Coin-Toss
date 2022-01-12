
/**
 * This class constructs a coin and simulates the flipping of said coin. 
 * @author Michael Chadwick
 * @version 2/20/2020
 */

import java.util.Random;
public class Coin
{
    boolean face; 
    Random randomF = new Random();

    /**
     * Constructs a new coin object and calls the flipCoin method.
     */
    public Coin()
    {
        flipCoin(); // initialise instance variable 
    }

    /**
     * Determines the coins facing ie Heads or Tails.
     */
    public void flipCoin()
    {
        face = randomF.nextBoolean(); //populate face
    }

    /**
     * This method returns the coins face value.
     * @return face - the coins face; either Heads or Tails.
     */
    public boolean getFace()
    {
        return face; //return face
    }

    /**
     * This meathod checks the boolean value of face and returns the string value "Heads" if it's true, and "Tails" if it's false.
     *@param boolean - the face of the coin
     *@return Heads/Tails - if true returns the string "Heads" else(ie false) returns the string "Tails".
     */
    public String toString(boolean face)
    {
        return(face == true) ? "Heads" : "Tails"; //check for true or false. If true execute 1st case if false execute 2nd.        
    }

}
