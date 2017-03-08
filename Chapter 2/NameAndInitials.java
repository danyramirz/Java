public class NameAndInitials
{
   public static void main(String[] args)
   {
      String firstName = "Daniel";    // First name
      String middleName = "Meeting";    // Middle name
      String lastName = "Ramirez";    // Last name
             
      char firstInitial;               
      char middleInitial;             
      char lastInitial;               
      
      // Gets the initials.
      firstInitial = firstName.charAt(0);
      middleInitial = middleName.charAt(0);
      lastInitial = lastName.charAt(0);
      
      // Display the contents of the variables.
      System.out.println("Name: " + firstName +
                         " " + middleName + " " +
                         lastName);
      System.out.println("Initials: " + firstInitial +
                         middleInitial + lastInitial);
   }
}