public class Main {
    public static void main (String args[])
    {
       String inputStr = "The cost of the T-shirt in $10.95.";
       String price = inputStr.substring(28,33);
       double priceAsDouble = Double.parseDouble(price);
       int discount = (int) (Math.random()*30)+1;
       double finalCost = priceAsDouble*(1-discount/100.0);
       String finalCostAsString = String.format("%.2f",finalCost);
       System.out.println(inputStr);
       System.out.println("The random discount of the day is " + discount+ "% off the original cost.");
       System.out.println("The final cost of the T-shirt is $"+finalCostAsString+".");
    }
}