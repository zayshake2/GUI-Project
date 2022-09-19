import FoodStuff.*;
import PersonStuff.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*; 
import javax.swing.JButton; 
import javax.swing.JPanel; 
import java.awt.Color; 
import java.awt.BorderLayout; 

class Main
{
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame("GUI Cafe");
      frame.setSize(400, 400);
      frame.setLocation(5, 5);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      JButton WorkerButton = new JButton("Worker");  
      WorkerButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {  
               Worker w1 = new Worker();    
               JOptionPane.showConfirmDialog(frame, 
                "\t You've selected the worker role! \n Please fill out the application for the job now.", "Worker Tab", JOptionPane.DEFAULT_OPTION);
               w1.apply();

               frame.setVisible(false);

            } 
         }); 
    
      JButton CustomerButton = new JButton("Customer"); 
      CustomerButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {  
              Customer c1 = new Customer();
              JOptionPane.showConfirmDialog(frame, 
                "\t You've selected the customer role! \n Please order your meal now.", "Customer Tab", JOptionPane.DEFAULT_OPTION);
                c1.order();
            } 
         }); 

      JLabel label = new JLabel("Pick a role!");
      JPanel panel = new JPanel(); 
      panel.add(label);
      frame.add(panel,BorderLayout.PAGE_START); 

      JPanel panelTwo = new JPanel(); 
      panelTwo.add(WorkerButton); 
      panelTwo.add(CustomerButton); 
      frame.add(panelTwo,BorderLayout.PAGE_END);
    
      ImageIcon icon = new ImageIcon("cutecafe1.jpg");  
      JLabel label1 = new JLabel(icon,SwingConstants.CENTER); 
      frame.add(label1);

      frame.setVisible(true);
   }
} 