import javax.swing.JOptionPane;

public class Question11 {

	public static void main(String[] args) {
		int male, female;
		male = Integer.parseInt(JOptionPane.showInputDialog("Enter # of male:"));
		female = Integer.parseInt(JOptionPane.showInputDialog("Enter # of female:"));

		double perMale = (double) male / (male + female) * 100;
		double perFemale = (double) female / (female + male) * 100;

		// percentage of male and female
		JOptionPane.showMessageDialog(null,
				"Male percentage :" + perMale + "%\n" + "Female percentage :" + perFemale + "%");
	}

}