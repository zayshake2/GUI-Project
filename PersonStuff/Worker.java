package PersonStuff;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random; 
import java.util.*;
import java.lang.Math;  
import java.text.DecimalFormat;


public class Worker extends Person
{

   public String name;
   public int age;
   public int YOE;


   public Worker()
   {
  
   }

   public void apply()
   {
  
      JFrame frame = new JFrame("Application Tab");
      frame.setSize(300, 200);
      frame.setLocation(4, 5);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      JPanel panel = new JPanel(); 

      JLabel namelabel = new JLabel("Name:");
      namelabel.setBounds(10,20,80,25);
      panel.add(namelabel);

      JTextField nametxt = new JTextField(20);
      nametxt.setBounds(70,20,100,25);
      panel.add(nametxt);

      JLabel agelabel = new JLabel("Age:");
      namelabel.setBounds(10,30,80,25);
      panel.add(agelabel);

      JTextField agetxt = new JTextField(20);
      agetxt.setBounds(70,20,100,25);
      panel.add(agetxt);

      JLabel YOElabel = new JLabel("Years of experience:");
      namelabel.setBounds(10,20,80,25);
      panel.add(YOElabel);

      JTextField YOEtxt = new JTextField(20);
      YOEtxt.setBounds(70,20,100,25);
      panel.add(YOEtxt);


      JButton SaveButton = new JButton("Save Info");  
      SaveButton.setBounds(10,40,80,25);
      SaveButton.setBackground(Color.GREEN);
      panel.add(SaveButton);

      frame.add(panel, BorderLayout.CENTER);
    
     
      SaveButton.addActionListener(new ActionListener() {
     
         public void actionPerformed(ActionEvent e) { 
            name=nametxt.getText();
            age=Integer.parseInt(agetxt.getText());
            YOE=Integer.parseInt(YOEtxt.getText());

            JOptionPane.showConfirmDialog(frame, 
                "\t Great, your application has been saved! Please wait for the results.", "Worker Tab",
                JOptionPane.DEFAULT_OPTION);
              
            if (age < 16 || YOE < 2)
            {
               JFrame eframe = new JFrame("Exit Frame");
               eframe.setSize(300, 300);
               eframe.setLocation(4, 5);
               eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               Icon icone = new ImageIcon("exit2.gif");  
               JLabel elabel = new JLabel(icone,SwingConstants.CENTER); 
               eframe.add(elabel);
    
               JPanel epanel = new JPanel(); 
               JOptionPane.showConfirmDialog(eframe, 
                    "\t Sorry, you don't get the job. Please exit the game.", "Worker Tab", JOptionPane.DEFAULT_OPTION);

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

               frame.setVisible(false);
            } 

              else 
              {
                 JOptionPane.showConfirmDialog(frame, 
                "\t You got the job! You can begin work immediently.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
                frame.setVisible(false);
                takeOrder();
              }
              frame.setVisible(false);

            } 
         }); 

      super.name=name; 
      super.age=age;

      frame.setVisible(true);

    
   }
 
  
   public void takeOrder() 
   {
      JFrame tframe=new JFrame("GUI Cafe");
      tframe.setSize(450,400);
      tframe.setLocation(5,5);
      tframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JLabel labelf=new JLabel("The order has been given by the customer!");
      JPanel panelf=new JPanel();
      panelf.add(labelf);
      tframe.add(panelf,BorderLayout.PAGE_START);

      JButton takeOrderButton=new JButton("Take Order");
      takeOrderButton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){ 
            JOptionPane.showConfirmDialog(tframe,  
              "\t \t You have taken the order. You can move on to making food for the customer.","Chef Tab",  JOptionPane.DEFAULT_OPTION);
            tframe.setVisible(false);

            JFrame bframe = new JFrame(" Chef Tab");
            bframe.setSize(500, 300);
            bframe.setLocation(5, 5);
            bframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Icon icon = new ImageIcon("makingfood.gif");  
            JLabel label1 = new JLabel(icon,SwingConstants.CENTER); 
            bframe.add(label1);

    
            JPanel panel = new JPanel(); 

            JButton ProceedButton = new JButton("PROCEED");
            ProceedButton.setBackground(Color.GREEN);
            panel.add(ProceedButton); 
            ProceedButton.addActionListener(new ActionListener(){
      
               public void actionPerformed(ActionEvent e) { 

                  kickOut();
                  bframe.setVisible(false);

               }

            });

            bframe.add(panel,BorderLayout.PAGE_END);
    
            bframe.setVisible(true);
       
         }

     });
      
      panelf.add(takeOrderButton);
      tframe.add(panelf,BorderLayout.PAGE_END);

      ImageIcon icon=new ImageIcon("takingorder.jpg");
      JLabel labelt=new JLabel(icon,SwingConstants.CENTER);
      tframe.add(labelt);

      tframe.setVisible(true);

   }

  

   public void kickOut() 
   { 
      Random random = new Random();
      int RandomValue = random.nextInt(50);

      if(RandomValue>=25)
      {
         JFrame kickFrame=new JFrame("GUI Cafe");
         kickFrame.setSize(600,400);
         kickFrame.setLocation(7,5);
         kickFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel kLabel=new JLabel("A customer is mad that the food is taking too long!");
         JPanel panelKick=new JPanel(); 
         panelKick.add(kLabel); 
         kickFrame.add(panelKick,BorderLayout.PAGE_START);

         ImageIcon image=new ImageIcon("angry_customer.jpg");
         JLabel angryImage=new JLabel(image,SwingConstants.CENTER); 
         kickFrame.add(angryImage); 

         JButton kickOutButton=new JButton("Kick out the customer?"); 
         JPanel kickButton=new JPanel(); 
         kickButton.add(kickOutButton); 
         kickFrame.add(kickButton,BorderLayout.PAGE_END); 

         kickFrame.setVisible(true); 
 
         kickOutButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               boolean customerKickedOut = false; 
               JFrame customerOut=new JFrame();
               customerOut.setSize(600,400);
               customerOut.setLocation(7,7);
               customerOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               JLabel customerOutLble = new JLabel("The customer has been kicked out! Phew!"); 
               JPanel outLabelPanel = new JPanel();
               outLabelPanel.add(customerOutLble); 
               customerOut.add(outLabelPanel,BorderLayout.PAGE_START); 

               ImageIcon image2 = new ImageIcon("kick_out_customer.jpg"); 
               JLabel angryImage2=new JLabel(image2,SwingConstants.CENTER); 
               customerOut.add(angryImage2);

               customerOut.setVisible(true); 
               kickFrame.setVisible(false);
               customerKickedOut = true; 
               takePayment(customerKickedOut);
          
            }
        });

      }
      else
      {
         takePayment(false); 
      }
    
    
   }

   public void takePayment(boolean customerKickedOut)
   {

      if(!customerKickedOut)
      {
         
         DecimalFormat df = new DecimalFormat("0.00");

         int min = 5;  
         int max = 15;
         double randomPrice = Math.random()*(max-min+1)+min;  
          
         JFrame frame4 = new JFrame("GUI Cafe");
         frame4.setSize(600, 450);
         frame4.setLocation(5, 5);
         frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel label4 = new JLabel("The price for the meal is $"+df.format(randomPrice)+". $"+df.format(randomPrice)+" has been given to you by the customer!");

         JPanel panel4 = new JPanel(); 
         panel4.add(label4);
         frame4.add(panel4,BorderLayout.PAGE_START); 
          
         JButton takeMoneyButton = new JButton("Take Payment");
         takeMoneyButton.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showConfirmDialog(frame4, 
                  "\t You took the payment! You can move on to Serving the table now.", "Payment Tab", JOptionPane.DEFAULT_OPTION);
               frame4.setVisible(false);
               JFrame serframe = new JFrame(" Waiter Tab");
               serframe.setSize(500, 300);
               serframe.setLocation(5, 5);
               serframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               Icon icon = new ImageIcon("servingfood.gif");  
               JLabel label1 = new JLabel(icon,SwingConstants.CENTER); 
               serframe.add(label1);

               JPanel panel = new JPanel(); 

               JButton ProceedButton = new JButton("PROCEED");
               ProceedButton.setBackground(Color.GREEN);
               panel.add(ProceedButton); 
               ProceedButton.addActionListener(new ActionListener() { 
                  public void actionPerformed(ActionEvent e) { 

                     cleanTable();
                     serframe.setVisible(false);

                  }
               });

               serframe.add(panel,BorderLayout.PAGE_END);
              
               serframe.setVisible(true);
                
            }
         });

         JPanel panel5 = new JPanel(); 
         panel5.add(takeMoneyButton); 
         frame4.add(panel5,BorderLayout.PAGE_END);
         ImageIcon icon = new ImageIcon("creditcard.gif");  
         JLabel label5 = new JLabel(icon,SwingConstants.CENTER); 
         frame4.add(label5);

         frame4.setVisible(true);


      }

      else
      {

         JFrame eframe = new JFrame("Exit Frame");
         eframe.setSize(300, 200);
         eframe.setLocation(7, 5);
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

      }
        
        
   }


   public void cleanTable() 
   {
      JFrame uframe = new JFrame("Used Table");
      uframe.setSize(400, 400);
      uframe.setLocation(5, 5);
      uframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ImageIcon icon = new ImageIcon("usetable.jpg");  
      JLabel label1 = new JLabel(icon,SwingConstants.CENTER); 
      uframe.add(label1);

      JPanel panel = new JPanel(); 

      JButton CleanButton = new JButton("CLEAN");
      panel.add(CleanButton); 
      CleanButton.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e) { 
               
            JOptionPane.showConfirmDialog(uframe,  
                "\t \t The table will be cleared now",  "Worker Tab",JOptionPane.DEFAULT_OPTION);
                
            JFrame nframe = new JFrame("Cleaning Table");
            nframe.setSize(400, 400);
            nframe.setLocation(5, 5);
            nframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ImageIcon icon2 = new ImageIcon("cleanintable.jpg");  
            JLabel label2 = new JLabel(icon2,SwingConstants.CENTER); 
            nframe.add(label2);
            nframe.setVisible(true);
            uframe.setVisible(false);
  
            JPanel panel1 = new JPanel();
            JButton setbutton = new JButton("SET TABLE");
            panel1.add(setbutton);
            setbutton.addActionListener(new ActionListener() { 
               public void actionPerformed(ActionEvent e) { 
 
                  JOptionPane.showConfirmDialog(nframe,  
                  "\t \t The table will be set now",  "Worker Tab",   JOptionPane.DEFAULT_OPTION);

                  JFrame sframe = new JFrame("Setting Table");
                  sframe.setSize(450, 300);
                  sframe.setLocation(5, 5);
                  sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                  ImageIcon icon3 = new ImageIcon("settingtable3.jpg");  
                  JLabel label3 = new JLabel(icon3,SwingConstants.CENTER); 
                  sframe.add(label3);
                  sframe.setVisible(true);

                  nframe.setVisible(false);

                  JPanel p =new JPanel();
                  JPanel pn =new JPanel();
                  JLabel Dlabel = new JLabel("All Done!...Ready to be used..");
                  JLabel Dlabel1 = new JLabel("You may now exit out of the game!");
                
                  p.add(Dlabel);
                  sframe.add(p, BorderLayout.PAGE_START);
                  pn.add(Dlabel1);
                  

                  JButton NextButton = new JButton("Next");  
                  NextButton.setBounds(10,40,80,25);
                  NextButton.setBackground(Color.GREEN);
                  pn.add(NextButton);

                  sframe.add(pn, BorderLayout.PAGE_END);

                   
                  NextButton.addActionListener(new ActionListener() {

                     public void actionPerformed(ActionEvent e) { 
                        JFrame eframe = new JFrame("Exit Frame");
                        eframe.setSize(300, 200);
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
                        sframe.setVisible(false);
                
                     } 
                  }); 

                } 
            }); 
                
            nframe.add(panel1,BorderLayout.PAGE_END);

         } 
      }); 

            
      uframe.add(panel,BorderLayout.PAGE_END);
    
      uframe.setVisible(true);

   }
  

  
}
  

