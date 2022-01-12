/**
 * This program tests the Coin and subCoin classes.
 * @author Michael Chadwick
 * @version 2/20/20
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class driverMain
{
    public static void main(String[] args)
    {
        Coin[] coin = new Coin[]{new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin()}; //create an array of seven coins
        int[] values = new int[]{1, 5, 10, 25, 50}; //creats array with the varrying monetary value of potential coins
        Random generator = new Random();

        int headsFlipped = 0; //counts the number of coins that landed on Heads
        int headsSum = 0; //sums the total monetary value of the coins that landed on Heads
        int headsValue = 0; //current value of last Heads flipped
        int tailsValue = 0; //current value of last Tails flipped

        for(int i = 0; i != coin.length; i++)
        {
            coin[i].flipCoin();
            int index = generator.nextInt(values.length);
            if(coin[i].getFace() == true)
            {
                headsFlipped++;
                headsValue = values[index];
                headsSum += headsValue;
                subCoin c = new subCoin(headsValue);
                System.out.println(coin[i].toString(true) + "\t" + headsValue + "\t" + c.toString());
            }
            else
            {
                tailsValue = values[index];
                subCoin c = new subCoin(tailsValue);
                System.out.printf(coin[i].toString(false) + "\t" + tailsValue  + "\t" + c.toString() + "\n");
            }

        }

        System.out.println("The number of heads:" + headsFlipped);
        System.out.println("The total value of heads:" + headsSum);
    }
}