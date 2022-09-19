package PersonStuff;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import FoodStuff.*;

public class Customer extends Person
{
   public boolean temperment; //true for angry, false for not
  
   public Customer()
   {
    
   }

   public void order()
   {
        
      JFrame f = new JFrame();   
      JLabel label= new JLabel("Choose your entree, drink, dessert, toppings, dessert sweetness level, & drink temperature."); 
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
      String[] food = new String[] {"Sandwich", "Pasta", "Pizza", "Steak", "Burger"};
      String[] Drinks = new String[] {"Coke", "Sprite", "Lemonade", "Sweet Tea", "Milkshake"};
      String[] Dessert = new String[] {"Cookies", "Cupcakes", "Cake", "Ice Cream", "Pie"}; 
      String[] addToppings = new String[] {"Add Toppings", "No Toppings"};
      String[] howSweet = new String[] {"Not Very Sweet", "Sort of Sweet", "Super Sweet"};
      String[] coldOrNot = new String[] {"Cold", "Room-temp"};

      JComboBox<String> comboFood = new JComboBox<String>(food); 
      JComboBox<String> comboDrinks = new JComboBox<String>(Drinks);
      JComboBox<String> comboDesserts = new JComboBox<String>(Dessert);
      JComboBox<String> comboToppings = new JComboBox<String>(addToppings);
      JComboBox<String> comboSweet = new JComboBox<String>(howSweet);
      JComboBox<String> comboTemp = new JComboBox<String>(coldOrNot);
 
      JButton b2 = new JButton("Place Order");  
      JPanel panel1 = new JPanel(); 
      panel1.add(comboFood); 
      panel1.add(comboDrinks); 
      panel1.add(comboDesserts);
      panel1.add(comboToppings);
      panel1.add(comboSweet);
      panel1.add(comboTemp);
 
      f.add(label,BorderLayout.PAGE_START); 
      f.add(panel1,BorderLayout.CENTER); 
      f.add(b2,BorderLayout.PAGE_END); 
     
      f.setSize(800, 200);     
      f.setVisible(true);

      b2.addActionListener(new ActionListener() { 
      
         public void actionPerformed(ActionEvent e) { 
            String entree= comboFood.getSelectedItem().toString();
            String drink= comboDrinks.getSelectedItem().toString();
            String dessert= comboDesserts.getSelectedItem().toString();
            String toppings= comboToppings.getSelectedItem().toString();
            String sweet= comboSweet.getSelectedItem().toString();
            String temp= comboTemp.getSelectedItem().toString();
              
            JOptionPane.showConfirmDialog(f, 
                "\t \t Your order has been placed. \n  Please wait for your order now.", "Order Tab", JOptionPane.DEFAULT_OPTION);
              
            //Sandwich Entree
            if (entree.equals("Sandwich"))
            {
               int index = 0;
               Meal m1 = new Meal(index);
               f.setVisible(false);        
            
               if(drink.equals("Coke"))
               {
                  index = 0;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sprite"))
               {
                  index = 1;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Lemonade"))
               {
                  index = 2;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sweet Tea"))
               {
                  index = 3;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Milkshake"))
               {
                  index = 4;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                    index = 1;
                    Desserts de1 = new Desserts(index, toppings, sweet);
                    payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }
       
            }

            //Pasta entree
            if (entree.equals("Pasta"))
            {
               int index = 1;
               Meal m1 = new Meal(index);

               f.setVisible(false);
               JFrame f2 = new JFrame();   
               JLabel label2= new JLabel("   Sorry to keep you waiting, but your order will take " +m1.waitTime+ " minutes to complete today as we are a bit busy.");
               f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               JButton yes = new JButton("That's okay!"); 
               JButton no = new JButton("What?! I'm in a rush!");  
               JPanel panel2 = new JPanel(); 
               panel2.add(yes); 
               panel2.add(no); 
               f2.add(label2,BorderLayout.CENTER);
               f2.add(panel2,BorderLayout.PAGE_END); 
        
               f2.setSize(800, 200);     
               f2.setVisible(true);

               if(drink.equals("Coke"))
               {
                  index = 0;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });

                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

              
               }

               if(drink.equals("Sprite"))
               {
                  index = 1;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Lemonade"))
               {
                  index = 2;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Sweet Tea"))
               {
                  index = 3;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Milkshake"))
               {
                  index = 4;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }
              
       
            }

            //Pizza entree
            if (entree.equals("Pizza"))
            {
               int index = 2;
               Meal m1 = new Meal(index);
               f.setVisible(false);

               if(drink.equals("Coke"))
               {
                  index = 0;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                     System.out.println("Check three.");
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sprite"))
               {
                  index = 1;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Lemonade"))
               {
                  index = 2;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sweet Tea"))
               {
                  index = 3;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Milkshake"))
               {
                  index = 4;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }
       
            }

            //Steak entree
            if (entree.equals("Steak"))
            {
               int index = 3;
               Meal m1 = new Meal(index);

               f.setVisible(false);
               JFrame f2 = new JFrame();   
               JLabel label2= new JLabel("Sorry to keep you waiting, but your order will take " +m1.waitTime+ " minutes to complete today as we are a bit busy.");
               f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               JButton yes = new JButton("That's okay!"); 
               JButton no = new JButton("What?! I'm in a rush!");  
               JPanel panel2 = new JPanel(); 
               panel2.add(yes); 
               panel2.add(no); 
               f2.add(label2,BorderLayout.CENTER);
               f2.add(panel2,BorderLayout.PAGE_END); 
        
               f2.setSize(800, 200);     
               f2.setVisible(true);

               if(drink.equals("Coke"))
               {
                  index = 0;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });

                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

              
               }

               if(drink.equals("Sprite"))
               {
                  index = 1;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Lemonade"))
               {
                  index = 2;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Sweet Tea"))
               {
                  index = 3;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }

               if(drink.equals("Milkshake"))
               {
                  index = 4;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                           JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     yes.addActionListener(new ActionListener() { 
                        public void actionPerformed(ActionEvent e) {   
                           JOptionPane.showConfirmDialog(f2, 
                           "\t Okay, great! We appreciate your business.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                           f2.setVisible(false);
                           temperment = false;
                           payWorker(m1.price, d1.price, de1.price);
                        } 
                     });

                     no.addActionListener(new ActionListener(){ 
                        public void actionPerformed(ActionEvent e) {   
                          JFrame eframe = new JFrame("You were kicked out!");
                          eframe.setSize(400, 300);
                          eframe.setLocation(4, 5);
                          eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                          Icon icone = new ImageIcon("exit2.gif");  
                          JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                          eframe.add(elabel);
    
                          JPanel epanel = new JPanel(); 

                          JButton ExitButton = new JButton("EXIT");  
                          ExitButton.setBounds(10,40,80,25);
                          ExitButton.setBackground(Color.RED);
                          epanel.add(ExitButton);

                          eframe.add(epanel, BorderLayout.PAGE_END);

                          ExitButton.addActionListener(new ActionListener() {
                             public void actionPerformed(ActionEvent e) { 

                                System.exit(0);

                             } 
                          }); 
                    
                           eframe.setVisible(true);
                           f2.setVisible(false);
                           temperment = true;
                        } 
                     });
                  }
               }
       
            }

            //Burger Entree
            if (entree.equals("Burger"))
            {
               int index = 4;
               Meal m1 = new Meal(index);
               f.setVisible(false);

               if(drink.equals("Coke"))
               {
                  index = 0;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sprite"))
               {
                  index = 1;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Lemonade"))
               {
                  index = 2;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Sweet Tea"))
               {
                  index = 3;
                  Drinks d1 = new Drinks(index, temp);
                  System.out.println("Check two.");

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }

               if(drink.equals("Milkshake"))
               {
                  index = 4;
                  Drinks d1 = new Drinks(index, temp);

                  if (dessert.equals("Cookies"))
                  {
                     index = 0;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cupcakes"))
                  {
                     index = 1;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Cake"))
                  {
                     index = 2;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Ice Cream"))
                  {
                     index = 3;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }

                  if (dessert.equals("Pie"))
                  {
                     index = 4;
                     Desserts de1 = new Desserts(index, toppings, sweet);
                     payWorker(m1.price, d1.price, de1.price);
                  }
               }
       
            }
          }
    
      });  
     
   }

   public void payWorker(double price1, double price2, double price3)
   {
      double total = price1 + price2 + price3;
      double roundedTotal = Math.round(total*100.0)/100.0;
      JFrame frame3 = new JFrame("GUI Cafe");
      frame3.setSize(400, 400);
      frame3.setLocation(5, 5);
      frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton payButton1 = new JButton("Pay With Tip");
      JButton payButton2 = new JButton("Pay With No Tip");
      JLabel label3 = new JLabel("Your total today is " +roundedTotal+ ".");
      JPanel panel3 = new JPanel(); 
      panel3.add(label3);
      frame3.add(panel3,BorderLayout.PAGE_START); 

      JPanel panel4 = new JPanel(); 
      panel4.add(payButton1);
      panel4.add(payButton2);
      frame3.add(panel4,BorderLayout.PAGE_END);
    
      ImageIcon icon = new ImageIcon("workerTakingPayment.jpeg");  
      JLabel label4 = new JLabel(icon,SwingConstants.CENTER); 
      frame3.add(label4);

      frame3.setVisible(true);

      payButton1.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            frame3.setVisible(false);
            tipWorker(roundedTotal);
         } 
      });
     
      payButton2.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            JOptionPane.showConfirmDialog(frame3, 
                "\t Okay, that's fine. Thanks for your payment! Please give your rating now.", "No Tip Tab", JOptionPane.DEFAULT_OPTION);
                rateFood();
            frame3.setVisible(false);
         } 
      });
   }

   public void tipWorker(double total)
   {
      JFrame frame5 = new JFrame("GUI Cafe");
      frame5.setSize(400, 400);
      frame5.setLocation(5, 5);
      frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton tipButton1 = new JButton("10% Tip");
      JButton tipButton2 = new JButton("15% Tip");
      JLabel label5 = new JLabel("How much do you want to tip today?");
      JPanel panel5 = new JPanel(); 
      panel5.add(label5);
      frame5.add(panel5,BorderLayout.PAGE_START); 

      JPanel panel6 = new JPanel(); 
      panel6.add(tipButton1);
      panel6.add(tipButton2);
      frame5.add(panel6,BorderLayout.PAGE_END);
    
      ImageIcon icon = new ImageIcon("tips.jpeg");  
      JLabel label6 = new JLabel(icon,SwingConstants.CENTER); 
      frame5.add(label6);

      frame5.setVisible(true);

      double roundedTotal1 = Math.round(total*100.0)/100.0;

      tipButton1.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            frame5.setVisible(false);
            double tip = roundedTotal1 * .10;
            double roundedTotal = Math.round(tip*100.0)/100.0;
            double newTotal = roundedTotal1 + roundedTotal; 
            double newTotal1 = Math.round(newTotal*100.0)/100.0;
            JFrame frame6 = new JFrame("GUI Cafe");
            frame6.setSize(400, 400);
            frame6.setLocation(5, 5);
            frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton tipButton3 = new JButton("Pay Now");
            JLabel label6 = new JLabel("Your new total is " +newTotal1+ ".");
            JPanel panel7 = new JPanel(); 
            panel7.add(label6);
            frame6.add(panel7,BorderLayout.PAGE_START); 

            JPanel panel8 = new JPanel(); 
            panel8.add(tipButton3);
            frame6.add(panel8,BorderLayout.PAGE_END);

            ImageIcon icon2 = new ImageIcon("workerTakingPayment.jpeg");  
            JLabel label6pt2 = new JLabel(icon2,SwingConstants.CENTER); 
            frame6.add(label6pt2);

            frame6.setVisible(true);
               
            tipButton3.addActionListener(new ActionListener() { 
               public void actionPerformed(ActionEvent e) 
               { 
                  JOptionPane.showConfirmDialog(frame6, 
                  "\t Thank you for your payment, we hope to see you again soon. You can give your rating now.", "Tip Tab", JOptionPane.DEFAULT_OPTION);
                  rateFood();
                  frame6.setVisible(false);
               } 
            });
               
         } 
      });
     
      tipButton2.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) { 
              frame5.setVisible(false);
              double tip2 = roundedTotal1 * .15;
              double roundedTotal2 = Math.round(tip2*100.0)/100.0;
              double newTotal2 = roundedTotal1 + roundedTotal2;
              double newTotal3 = Math.round(newTotal2*100.0)/100.0; 
              JFrame frame10 = new JFrame("GUI Cafe");
              frame10.setSize(400, 400);
              frame10.setLocation(5, 5);
              frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              JButton tipButton4 = new JButton("Pay Now");
              JLabel label10 = new JLabel("Your new total is " +newTotal3+ ".");
              JPanel panel10 = new JPanel(); 
              panel10.add(label10);
              frame10.add(panel10,BorderLayout.PAGE_START); 

              JPanel panel11 = new JPanel(); 
              panel11.add(tipButton4);
              frame10.add(panel11,BorderLayout.PAGE_END);

              ImageIcon icon3 = new ImageIcon("workerTakingPayment.jpeg");  
              JLabel label10pt2 = new JLabel(icon3,SwingConstants.CENTER); 
              frame10.add(label10pt2);

              frame10.setVisible(true);
               
              tipButton4.addActionListener(new ActionListener() { 
                 public void actionPerformed(ActionEvent e) 
                 { JOptionPane.showConfirmDialog(frame10, "\t Thank you for your payment, we hope to see you again soon. You can give your rating now.", "Tip Tab", JOptionPane.DEFAULT_OPTION);
                    rateFood();
                    frame10.setVisible(false);
                 } 
              });
           } 
      });   
   }


   public void rateFood()
   {
      JFrame rframe=new JFrame("GUI Cafe");
      rframe.setSize(450,400);
      rframe.setLocation(5,5);
      rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JLabel labelr=new JLabel("Please rate the food");
      JPanel panelr=new JPanel();
      panelr.add(labelr);
      rframe.add(panelr,BorderLayout.PAGE_START);
      rframe.setVisible(true);
     
      JButton giveRatingButton= new JButton("Give Rating");
      giveRatingButton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            JOptionPane.showConfirmDialog(rframe,"Please give your rating now.","Rating Tab",JOptionPane.DEFAULT_OPTION);
            rframe.setVisible(false);

            JFrame Rframe=new JFrame("Rating Tab");
            Rframe.setSize(400,400);
            Rframe.setLocation(5,5);
            Rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            JPanel panelv=new JPanel();

            ImageIcon hicon1= new ImageIcon("happy2.jpg");
            ImageIcon aicon1= new ImageIcon("neutral2.jpg");
            ImageIcon picon1=new ImageIcon("poor2.jpg");

            JButton GButton=new JButton(hicon1);
            panelv.add(GButton);
            GButton.addActionListener(new ActionListener(){
      
               public void actionPerformed(ActionEvent e) { 

                  JFrame eframe = new JFrame("Thanks for your rating!");
                  eframe.setSize(400, 300);
                  eframe.setLocation(4, 5);
                  eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  Icon icone = new ImageIcon("exit2.gif");  
                  JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                  eframe.add(elabel);
    
                  JPanel epanel = new JPanel(); 

                  JButton ExitButton = new JButton("EXIT");  
                  ExitButton.setBounds(10,40,80,25);
                  ExitButton.setBackground(Color.RED);
                  epanel.add(ExitButton);

                  eframe.add(epanel, BorderLayout.PAGE_END);

                  ExitButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) { 

                        System.exit(0);

                     } 
                  }); 
                    
                  eframe.setVisible(true);

                  JFrame gframe=new JFrame("Good Rating");
                  gframe.setSize(400,400);
                  gframe.setSize(200,200);
                  gframe.setLocation(5,5);
                  gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
                  gframe.setVisible(false);
                  Rframe.setVisible(false);
               }

            });

            Rframe.add(panelv,BorderLayout.CENTER);
            Rframe.setVisible(true);
       
        
            JButton AButton= new JButton(aicon1);
            panelv.add(AButton);
            AButton.addActionListener(new ActionListener(){
      
               public void actionPerformed(ActionEvent e) { 

                  JFrame eframe = new JFrame("Thanks for your rating!");
                  eframe.setSize(400, 300);
                  eframe.setLocation(4, 5);
                  eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  Icon icone = new ImageIcon("exit2.gif");  
                  JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                  eframe.add(elabel);
    
                  JPanel epanel = new JPanel(); 

                  JButton ExitButton = new JButton("EXIT");  
                  ExitButton.setBounds(10,40,80,25);
                  ExitButton.setBackground(Color.RED);
                  epanel.add(ExitButton);

                  eframe.add(epanel, BorderLayout.PAGE_END);

                  ExitButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) { 

                        System.exit(0);

                     } 
                  }); 
                    
                 eframe.setVisible(true);
                
                 JFrame aframe=new JFrame("Average Rating");
                 aframe.setSize(400,400);
                 aframe.setSize(200,200);
                 aframe.setLocation(5,5);
                 aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
                 aframe.setVisible(false);
                 Rframe.setVisible(false);

               }

            });

            Rframe.add(panelv,BorderLayout.CENTER);
            Rframe.setVisible(true);

            JButton PButton= new JButton(picon1);
            panelv.add(PButton);
            PButton.addActionListener(new ActionListener(){
      
               public void actionPerformed(ActionEvent e) { 

                  JFrame pframe=new JFrame("Poor Rating");
                  pframe.setSize(100,100);
                  pframe.setSize(200,200);
                  pframe.setLocation(5,5);
                  pframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  JFrame eframe = new JFrame("Thanks for your rating!");
                  eframe.setSize(400, 300);
                  eframe.setLocation(4, 5);
                  eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  Icon icone = new ImageIcon("exit2.gif");  
                  JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
                  eframe.add(elabel);
    
                  JPanel epanel = new JPanel(); 

                  JButton ExitButton = new JButton("EXIT");  
                  ExitButton.setBounds(10,40,80,25);
                  ExitButton.setBackground(Color.RED);
                  epanel.add(ExitButton);

                  eframe.add(epanel, BorderLayout.PAGE_END);

                  ExitButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) { 

                        System.exit(0);

                     } 
                  }); 
                    
                  eframe.setVisible(true);

      
                  pframe.setVisible(false);
                  Rframe.setVisible(false);
               }

            });
               
        
            Rframe.add(panelv,BorderLayout.CENTER);
            Rframe.setVisible(true);
         }
    
      });
      panelr.add(giveRatingButton);
      rframe.add(panelr,BorderLayout.PAGE_END);
     
      ImageIcon ratingicon=new ImageIcon("rate.jpg");
      JLabel ratinglabel=new JLabel(ratingicon,
      SwingConstants.CENTER);
      rframe.add(ratinglabel);
    
      rframe.setVisible(true);
     
   }

}

