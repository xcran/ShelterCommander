package sheltercommander;

/**
 *
 * @author xcran
 */
public class OutsideAdventure {
	public static void generator(Gatherer gatherer, int hours){
		for(int i = 0; i <= hours; i++){
			if(i == 0){
				System.out.println("Getting out of base... lets see what's comming.");
			}
			else{
				System.out.println("I cant find anything");
			}
		}
	}
}
