package sheltercommander;

import java.util.*;

/**
 *
 * @author xcran
 */

public class ShelterCommander {
	
	public static void main(String[] args) {
		
		ArrayList <Gatherer> gatherers = new ArrayList <>();
		ArrayList <GathererObject> objects = new ArrayList <>();
		GathererObject [] gathererObjects = null;
		
		Gatherer gathererOne = new Gatherer(1, 100, 0, 2, 4, 3, gathererObjects, "Marie Gatherer");
		Gatherer gathererTwo = new Gatherer(1, 110, 0, 3, 2, 3, gathererObjects, "Ringo Gatherer");
		
		gatherers.add(gathererOne);
		gatherers.add(gathererTwo);
		
		Commander commanderOne = new Commander("Peter Commander", 1, 0, gatherers);
		Base baseOne = new Base(commanderOne, gatherers, objects, "base One");
		
		Scanner read = new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("Choose one:\n1. go adventure\n4. exit");
			option = read.nextInt();
			switch(option){
				case 1:
					OutsideAdventure.generator(gathererOne, 7);
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("Choose a real option...");
					break;
			}
			
		}while (option != 4);
	}
	
}
