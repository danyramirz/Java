import javax.swing.*;
import java.awt.event.*;
public class Mpg extends JFrame{
private JPanel panel; 
private JLabel messageLabelgallons;
private JLabel messageLabelmiles;
private JTextField gallonsTextField;
private JTextField milesTextField;
private JButton mpgbutton; 
private final int windowwidth = 500;
private final int windowheight = 500;
//constructor
public Mpg(){
setTitle("MPG calculator");
//set the size of window
setSize(windowheight, windowwidth);
//close button
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//build panel
buildPanel();
//add the panel
add(panel);
//display window
setVisible(true);
}
private void buildPanel(){
messageLabelgallons = new JLabel("Enter the amount of gallons used: ");
gallonsTextField = new JTextField(10);
messageLabelmiles = new JLabel("enter number of miles: ");
milesTextField = new JTextField(10);
//create button to calculate
mpgbutton = new JButton("Calculate MPG");
mpgbutton.addActionListener(new CalculateMPG());
//add items to panel
panel = new JPanel();
panel.add(messageLabelgallons);
panel.add(gallonsTextField);
panel.add(messageLabelmiles);
panel.add(milesTextField);
panel.add(mpgbutton);
}
public class CalculateMPG implements ActionListener{
public void actionPerformed(ActionEvent e){
String inputone;
String inputtwo;
double mpg;
inputone = gallonsTextField.getText();
inputtwo = milesTextField.getText();
mpg = (Double.parseDouble(inputtwo) / Double.parseDouble(inputone));
//output
JOptionPane.showMessageDialog(null, "MPG of the cars is " + mpg);
}
}
public static void main(String [] args){
new Mpg();
}
}

