import javax.swing.*;
import java.awt.event.*;
public class Temp extends JFrame{
private JPanel panel; 
private JLabel messageLabel;
private JTextField celisus;
private JButton Fbutton;
private final int windowwidth = 500;
private final int windowheight = 500;
//constructor
public Temp(){
setTitle("Temperature convertor");
setSize(windowheight, windowwidth);
//close button
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
buildPanel();
//add the panel
add(panel);
//display window
setVisible(true);
}
private void buildPanel(){
messageLabel = new JLabel("Enter Celsius temperature: ");
celisus = new JTextField(10);
Fbutton = new JButton("Calculate");
Fbutton.addActionListener(new Calc());
panel = new JPanel();
panel.add(messageLabel);
panel.add(celisus);
panel.add(Fbutton);
}
private class Calc implements ActionListener{
public void actionPerformed(ActionEvent e){
String input;
double f,c;
input = celisus.getText();
c = Double.parseDouble(input);
f=c*(9/5) + 32;
//output
JOptionPane.showMessageDialog(null, c + "Celcius is " + f + "in Fahrenhiet.");			
}
}
public static void main(String [] args){
new Temp();
}
}
