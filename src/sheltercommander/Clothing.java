package sheltercommander;

/**
 *
 * @author xcran
 */
public class Clothing extends GathererObject{

	public Clothing(int intellUp, int enduranceUp) {
		this.intellUp = intellUp;
		this.enduranceUp = enduranceUp;
	}

	@Override
	public void setEnduranceUp(int enduranceUp) {
		super.setEnduranceUp(enduranceUp); 
	}

	@Override
	public int getEnduranceUp() {
		return super.getEnduranceUp(); 
	}

	@Override
	public void setIntellUp(int intellUp) {
		super.setIntellUp(intellUp); 
	}

	@Override
	public int getIntellUp() {
		return super.getIntellUp(); 
	}
	
}
