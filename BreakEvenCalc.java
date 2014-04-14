package breakevencalc;

import java.util.Scanner;

/**
 *
 * @author samuelfrench
 * SamFrench@gmail.com
 * github: samuelfrench
 */
public class BreakEvenCalc
{

    final static double baseCommission = 9.99;
    final static double perContractComm = 0.75;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean call;
        boolean buy;

        Double strikePrice, contractValue, totalCommission, quantity, perUnitComm, BE;
        while (true)
        {
            System.out.println("Did you buy or sell the option (0 for buy, 1 for sell): ");
            if (sc.nextInt() == 0)
            {
                buy = true;
            } else
            {
                buy = false;
            }
            System.out.println("Is this a call or a put (0 for call, 1 for put):");
            if (sc.nextInt() == 0)
            {
                call = true;
            } else
            {
                call = false;
            }

            System.out.println("What is the strike price?");
            strikePrice = sc.nextDouble();

            System.out.println("What is the option premium at present ");
            System.out.println("or purchase, if you want to calculate the BE at that time):");
            System.out.println("(per contact)");
            contractValue = sc.nextDouble();

            System.out.println("How many contracts?");
            quantity = sc.nextDouble();

            totalCommission = baseCommission + (perContractComm * quantity);

            perUnitComm = totalCommission / quantity;

            if (call)
            {
                BE = strikePrice + contractValue + perUnitComm;
            } else
            {
                BE = strikePrice - (contractValue + perUnitComm);
            }

            if (buy)
            {

                if (call)
                {
                    System.out.println("You will break even (or make money) if");
                    System.out.println("the stock price is at (or above): " + BE);
                } else
                {
                    System.out.println("You will break even (or make money) if");
                    System.out.println("the stock price is at (or below): " + BE);
                }
            } else
            {
                if (call)
                {
                    System.out.println("You will break even (or make money) if");
                    System.out.println("the stock price is at (or below): " + BE);
                } else
                {
                    System.out.println("You will break even (or make money) if");
                    System.out.println("the stock price is at (or above): " + BE);
                }
            }
        }
    }
}
