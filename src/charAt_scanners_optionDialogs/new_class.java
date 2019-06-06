package charAt_scanners_optionDialogs;

import java.util.Scanner;

public class new_class {
	public static void main(String[] args) {
		String Pi = "http://www.piday.org/million/";
		System.out.println(Pi.charAt(3));
		for(int i=0;i<Pi.length();i++) {
		System.out.println(Pi.charAt(i));
		speak(Pi.charAt(i));
		


		}
		char guess = getInputFromUser();

		
	}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}
