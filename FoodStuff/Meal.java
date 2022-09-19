package FoodStuff;

public class Meal
{
   public String itemName;
   public double price;
   public int waitTime;

   String[] food = new String[] {"Sandwich", "Pasta", "Pizza", "Steak", "Burger"};
   double[] priceArray = new double[] {10.99, 15.99, 7.99, 20.99, 6.99};
   int[] waittime = new int[] {6, 15, 5, 20, 10};
   
   public Meal(int index) 
   {
      itemName = food[index];
      price = priceArray[index];
      waitTime = waittime[index];
   } 

   public Meal()
   {
     
   }
     
}