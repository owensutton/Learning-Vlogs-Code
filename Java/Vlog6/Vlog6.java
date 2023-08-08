package Java.Vlog6;

// java gui application that has one button, when selected it adds one to a counter. 

import java.awt.event.*;  
import javax.swing.*;  

class Vlog6{
    
    // Declare counter
    public static int counter=0;
      public static void main(String args[]){
        // Create the gui
           JFrame frame = new JFrame("Button Counter");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);

        // add Text View
           final JTextField tf=new JTextField();
           tf.setBounds(50,50,150,20);
        
        // add button
          JButton button1 = new JButton("Press Me");
          button1.setBounds(50,100,95,30);

        // add reset button
          JButton button2 = new JButton("Reset");
          button2.setBounds(50,150,95,30);
        
        // add button logic 
          button1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        counter += 1; 
                        String str = Integer.toString(counter);
                        tf.setText(str);  
                    }  
                });  

        // add reset button logic 
          button2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        counter = 0; 
                        String str = Integer.toString(counter);
                        tf.setText(str);  
                    }  
                });
          
                frame.add(button1);frame.add(tf);frame.add(button2); 
                frame.setSize(400,400);  
                frame.setLayout(null);  
                frame.setVisible(true); 
     }
}