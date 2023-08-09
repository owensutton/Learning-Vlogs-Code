package Java.Vlog7;

// Building a Calculator using Java

import java.awt.event.*;  
import javax.swing.*;  
import java.util.*;

class Vlog7{

    public static String Computation = "";

    public static void main(String args []){
        // Create the Calculator GUI
        JFrame frame = new JFrame("Button Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        // add Text View/Screen
        final JTextField tf=new JTextField();
        tf.setBounds(20,50,340,30);

        // Add Calculator Buttons
        // AC Button
        JButton buttonAC = new JButton("AC");
        buttonAC.setBounds(10,100,95,30);

        // Add #7 Button
        JButton button7 = new JButton("7");
        button7.setBounds(10,130,95,30);
        // Add #8 Button
        JButton button8 = new JButton("8");
        button8.setBounds(105,130,95,30);
        // Add #9 Button
        JButton button9 = new JButton("9");
        button9.setBounds(200,130,95,30);
        // Add Divide Button
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(295,130,95,30);

        // Add #4 Button
        JButton button4 = new JButton("4");
        button4.setBounds(10,160,95,30);
        // Add #5 Button
        JButton button5 = new JButton("5");
        button5.setBounds(105,160,95,30);
        // Add #6 Button
        JButton button6 = new JButton("6");
        button6.setBounds(200,160,95,30);
        // Add Multiple Button
        JButton buttonMultiple = new JButton("*");
        buttonMultiple.setBounds(295,160,95,30);

        // Add #1 Button
        JButton button1 = new JButton("1");
        button1.setBounds(10,190,95,30);
        // Add #2 Button
        JButton button2 = new JButton("2");
        button2.setBounds(105,190,95,30);
        // Add #3 Button
        JButton button3 = new JButton("3");
        button3.setBounds(200,190,95,30);
        // Add Minus Button
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(295,190,95,30);

        // Add #0 Button
        JButton button0 = new JButton("0");
        button0.setBounds(10,220,95,30);
        // Add Decimal Button
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setBounds(105,220,95,30);
        // Add Equal Button
        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(200,220,95,30);
        // Add Addition Button
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(295,220,95,30);

        // Add logic to each of the buttons
        // All Clear Button
        buttonAC.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation = "";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #7
        button7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "7 ";
                        tf.setText(Computation);  
                    }  
                }); 
        
        // Button #8
        button8.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "8 ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #9
        button9.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "9 ";
                        tf.setText(Computation);  
                    }  
                }); 
        
        // Button #Divide
        buttonDivide.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "/ ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #4
        button4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "4 ";
                        tf.setText(Computation);  
                    }  
                }); 
        
        // Button #5
        button5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "5 ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #6
        button6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "6 ";
                        tf.setText(Computation);  
                    }  
                }); 
        
        // Button #Multiple
        buttonMultiple.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "* ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #1
        button1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "1 ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #2
        button2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "2 ";
                        tf.setText(Computation);  
                    }  
                }); 
        
        // Button #3
        button3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "3 ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #Minus
        buttonMinus.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "- ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #0
        button0.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "0 ";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #Decimal
        buttonDecimal.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += ".";
                        tf.setText(Computation);  
                    }  
                }); 

        // Button #Equal
        buttonEqual.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 

                  try (Scanner sc = new Scanner(Computation)) {
                      int firstValue = Integer.parseInt(sc.findInLine("[0-9]*"));
                      String operator = sc.findInLine("[^0-9]*").trim();
                      int secondValue = Integer.parseInt(sc.findInLine("[0-9]*"));

                      switch (operator){
                          case "+":
                              tf.setText(String.valueOf(firstValue + secondValue)); 
                              break;
                          case "-":
                              tf.setText(String.valueOf(firstValue - secondValue)); 
                              break;
                          case "/":
                              tf.setText(String.valueOf(firstValue / secondValue)); 
                              break;
                          case "*":
                              tf.setText(String.valueOf(firstValue * secondValue)); 
                              break;
                        }
                } catch (NumberFormatException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                    
                }
                }); 

        // Button #Add
        buttonPlus.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Computation += "+ ";
                        tf.setText(Computation);  
                    }  
                }); 
            
        // Make Buttons Visible
        frame.add(buttonAC);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonDivide); 
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonMultiple); 
        frame.add(button3);
        frame.add(button2);
        frame.add(button1);
        frame.add(buttonMinus);
        frame.add(button0);
        frame.add(buttonDecimal);
        frame.add(buttonEqual);
        frame.add(buttonPlus); 
        frame.add(tf); 
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true); 

    }
}