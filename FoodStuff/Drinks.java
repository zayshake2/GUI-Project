package FoodStuff;

public class Drinks extends Meal
{
   public boolean temperature; //true for cold, false for room-temp
   public double fluidOz;

   String[] drink = new String[] {"Coke", "Sprite", "Lemonade", "Sweet Tea", "Milkshake"};
   double[] price2 = new double[] {1.99, 1.99, 3.99, 2.99, 4.99};
   int[] waittime2 = new int[] {1, 1, 2, 1, 3};
   double[] fluidOzArray = new double[] {16.5, 16.5, 18.5, 16.5, 21.5};
   
   public Drinks(int index, String tempGiven) 
   {
      super(index);
      fluidOz = fluidOzArray[index];
      itemName = drink[index];
      price = price2[index];
      waitTime = waittime2[index];

      if (tempGiven.equals("Cold"))
      {
         temperature = true;
      }

      if (tempGiven.equals("Room-temp"))
      {
         temperature = false;
      }
          
   } 
 
}