double stockPrice, currentOptionValue, BE, commissions, quantity;
double baseCommission = 9.99;
double perItemCommission = 0.75;
boolean callOption, buy;

Scanner sc = new Scanner(System.in);
while(true)
{
    System.out.println("Did you buy or sell the option? (0 for buy, 1 for sell");
    if(sc.nextInt()==0)
    {
        buy = true;
    } else {
        buy = false;
    }
    
    System.out.println("Was this a call or put? (0 for call, 1 for put)");
    if(sc.nextInt()==0)
    {
        call = true;
    } else {
        call = false;
    }
    
    System.out.println("How many options contracts did you purchase?")
    quantity = sc.nextDouble();
    
    
    System.out.println("What can you sell/buy the option for at present (price per contact)");
    currentOptionValue = sc.nextDouble();
    
    System.out.println("What is the current stock price?");
    stockPrice = sc.nextDouble();
    
    commissions = baseCommission + (perItemCommission*quantity);
    System.out.println("Your commissions were " + commissions);
    
    if(call)
    {
        BE = 
    }
}