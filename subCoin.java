
/**
 * This class extends the Coin class by adding it's denomination. It determines this by checking the monetary value passed to it
 * from main against a switch statement.
 * @author Michael Chadwick
 * @version 2/20/20
 */

public class subCoin extends Coin
{
    int coinValue; //The coin's monetary value.
    String coinType; //The coin's denomination(ie PENNY, NIKEL, etc).

    /**
     * Constructs a nec coin object from the Coin superclass and the value passed to it.
     * It then calls the getType method to determine it's type by passing it the coin's value.
     * @param coinValue - the coin's monetary value.
     */
    public subCoin(int coinValue)
    {    
        super();
        this.coinValue = getValue(); 
        this.coinType = getType(coinValue);
    }

    /**
     * This method uses a switch statement to determine the coin's denomination by comparing it's value vs the cases.
     * @param coinValue - the coin's monetary value.
     * @return coinType - the coin's denomination.
     */
    public String getType(int coinValue)
    {
        switch(coinValue)
        {
            case 1: 
            coinType = "PENNY";
            break;
            case 5: 
            coinType = "NIKEL";
            break;
            case 10: 
            coinType = "DIME";
            break;
            case 25: 
            coinType = "QUARTER";
            break;
            case 50: 
            coinType = "HALF-DOLLAR";
            break;
        }
        return coinType;
    }

    /**
     * This method returns the coin's value.
     * @return coinValue - returns the coin's value.
     */
    public int getValue()
    {
        return coinValue;
    }

    /**
     * This method returns the coins type as a string.
     * @return coinType - returns the coin's denomination as a string.
     */
    @Override
    public String toString()
    {
        return (coinType);
    }
}
