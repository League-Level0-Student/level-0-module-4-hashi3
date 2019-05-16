package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String[] petlists = {"cuddle", "food", "water", "take a walk", "groom", "clean up poop"};
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog( "what kind pet do you want");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
          int selection = JOptionPane.showOptionDialog(null, "selec the option", " pets questions ", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, petlists, 0);
          System.out.println(selection);
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
  // use switch statement
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle(){
		JOptionPane.showMessageDialog(null, "good dog");
		happinessLevel++;
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "eat up");
		happinessLevel++;

	}
	static void water() {
		JOptionPane.showMessageDialog(null, "drink up");
		happinessLevel++;
	}
	static void  takeAwalk() {
		JOptionPane.showMessageDialog(null, "let's go");
		happinessLevel++;
	}
	static void room() {
		JOptionPane.showMessageDialog(null, "groom");
		happinessLevel++;
	}
	static void cleanUppoop() {
		JOptionPane.showMessageDialog(null, "drink up" );	
		happinessLevel++;

	}
	
	
	
}