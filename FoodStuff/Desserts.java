package FoodStuff;

public class Desserts extends Meal
{
   public boolean toppings;
   public String sweetness;

   String[] dessert = new String[] {"Cookies", "Cupcakes", "Cake", "Ice Cream", "Pie"};
   double[] price3 = new double[] {1.99, 1.99, 3.99, 2.99, 4.99};
   int[] waittime3 = new int[] {1, 1, 2, 1, 3};
   
   public Desserts(int index, String toppingsGiven, String sweetnessGiven) 
   {
      super(index);
      itemName = dessert[index];
      price = price3[index];
      waitTime = waittime3[index];

      if (toppingsGiven.equals("Add Toppings"))
      {
         toppings = true;
      }

      else
      {
         toppings = false;
      }

      sweetness = sweetnessGiven;
     
   } 

}