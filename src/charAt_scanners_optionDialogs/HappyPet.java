package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	private static int happinessLevel = 0;
	public static void main(String[] args) {
		
	
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String Pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");

		//int task = JOptionPane.showOptionDialog(null, "WHAT WOULD YOU LIKE TO DO TO MAKE YOUR PET HAPPIER?", "HAPPY PET HAPPY LIFE", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Feed it","Walk it","Scratch it"},null);


		
		 while(true) {
				int task = JOptionPane.showOptionDialog(null, "WHAT WOULD YOU LIKE TO DO TO MAKE YOUR PET HAPPIER?", "HAPPY PET HAPPY LIFE", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Feed it","Walk it","Scratch it"},null);

			 if( task == 0) {
				  feed();
			  }		  
			  else if(task == 1) {
				  walk_it();
			  }		  
			  else if(task == 2) {
			      scratch();	  
			  }
			  else {
				  System.out.println("that is not an option");
			  }	
			 
			 System.out.println (happinessLevel);
			 if(happinessLevel== 100) {
			   JOptionPane.showMessageDialog(null, "you love your " + Pet );
			   break;
			 }
			 
		 }

	}	// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.


public static void feed() {
//	JOptionPane
	
	happinessLevel += 10;
}
public static void walk_it() {
//	JOptionPane
	
	happinessLevel += 10;
}
public static void scratch () {
//	JOptionPane
	
	happinessLevel += 10;
}

}