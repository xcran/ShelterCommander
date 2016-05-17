package sheltercommander;

/**
 *
 * @author xcran
 */
abstract class GathererObject {
	
	protected int strengthUp;
	protected int intellUp;
	protected int enduranceUp;

	public int getStrengthUp() {
		return strengthUp;
	}

	public void setStrengthUp(int strengthUp) {
		this.strengthUp = strengthUp;
	}

	public int getIntellUp() {
		return intellUp;
	}

	public void setIntellUp(int intellUp) {
		this.intellUp = intellUp;
	}

	public int getEnduranceUp() {
		return enduranceUp;
	}

	public void setEnduranceUp(int enduranceUp) {
		this.enduranceUp = enduranceUp;
	}
	
	
}
