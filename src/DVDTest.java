import java.util.*;

/**
 * 	Program to display and modify a simple DVD collection
 */

public class DVDTest {

	public static void main(String[] args) {
		
		DVDUserInterface dlInterface;
		DVDCollection dl = new DVDCollection();

		Scanner scan = new Scanner(System.in);		
		dl.loadData("");

		System.out.println("Input interface type: C=Console, G=GUI");
		String interfaceType = scan.nextLine();
		if (interfaceType.equals("C")) {
			dlInterface = new DVDConsoleUI(dl);
			dlInterface.processCommands();
		} else if (interfaceType.equals("G")) {
			dlInterface = new DVDGUI(dl);
			dlInterface.processCommands();
		} else {
			System.out.println("Unrecognized interface type. Program exiting.");
			System.exit(0);
		}
		
	}

}
