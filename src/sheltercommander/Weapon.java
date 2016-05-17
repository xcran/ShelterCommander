package sheltercommander;

/**
 *
 * @author xcran
 */
public class Weapon extends GathererObject {

	public Weapon(int strengthUp) {
		this.strengthUp = strengthUp;
	}

	@Override
	public void setStrengthUp(int strengthUp) {
		super.setStrengthUp(strengthUp); 
	}

	@Override
	public int getStrengthUp() {
		return super.getStrengthUp(); 
	}
	
	
}
